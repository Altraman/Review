package enjoy.synthesize;

import java.util.Hashtable;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class SharedStringFactory {

    private static Hashtable<String, SharedString> HASH_TABLE;

    public SharedStringFactory() {
        HASH_TABLE = new Hashtable<>();
    }

    private static final class Holder {
        private static final SharedStringFactory INSTANCE = new SharedStringFactory();
    }

    public static SharedStringFactory getInstance() {
        return Holder.INSTANCE;
    }

    public SharedString getSharedString(String tag) {
        if (HASH_TABLE.containsKey(tag)) {
            return HASH_TABLE.get(tag);
        } else {
            final SharedString sharedString = new SharedString(tag);
            HASH_TABLE.put(tag, sharedString);
            return HASH_TABLE.get(tag);
        }
    }
}
