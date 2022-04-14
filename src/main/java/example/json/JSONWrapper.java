package example.json;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * <pre>
 *         Object[] objects = mapper.readValue(jsons, Object[].class);
 *         JSONWrapper wrapper = new JSONWrapper(objects);
 *         Object out = wrapper.extract("[0].pageUrl");
 *         System.out.println(out);
 * </pre>
 */
public class JSONWrapper {
    private final Object jsonObj;

    public JSONWrapper(Object jsonData) {
        this.jsonObj = jsonData;
    }

    public <T> T extract(String path) {
        String[] pathParts = getPathTokens(path);
        Object curObj = jsonObj;
        for (int i = 0; i < pathParts.length; i++) {
            String token = pathParts[i];
            if (token.startsWith("[")) {
                //need an array
                if (curObj.getClass().isArray()) {
                    curObj = ((Object[]) curObj)[i];
                } else if (curObj instanceof List) {
                    curObj=((List<Object>)curObj).get(Integer.parseInt(token.substring(1,token.length()-1)));
                } else {
                    throw new NoSuchElementException(token);
                }
            } else {
                //need a map
                if (curObj instanceof Map) {
                    Map<String, Object> map = (Map<String, Object>) curObj;
                    curObj = map.get(token);
                } else {
                    //reflection
                    try {
                        curObj = curObj.getClass().getField(token);
                    } catch (NoSuchFieldException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }
            }
        }
        return (T) curObj;
    }

    /**
     * Split path string into tokens.
     * TODO
     * Use regex or tokenizer to split.
     *
     * @param path the original path string to be split into tokens.
     * @return a series of tokens.
     */
    private String[] getPathTokens(String path) {
        return path.split("\\.");
    }


}
