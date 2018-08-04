package org.odk.share.utilities;

import org.odk.share.R;
import org.odk.share.application.Share;

import java.util.HashMap;

/**
 * Created by laksh on 5/20/2018.
 */

public class ApplicationConstants {

    // based on http://www.sqlite.org/limits.html
    public static final int SQLITE_MAX_VARIABLE_NUMBER = 999;
    public static final int ASK_REVIEW_MODE = 1;
    public static final int SEND_REVIEW_MODE = 2;

    public abstract static class SortingOrder {
        public static final int BY_NAME_ASC = 0;
        public static final int BY_NAME_DESC = 1;
        public static final int BY_DATE_DESC = 2;
        public static final int BY_DATE_ASC = 3;
    }

    public static HashMap<String, Integer> getSortLabelToIconMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(Share.getInstance().getString(R.string.sort_by_name_asc), R.drawable.ic_sort_by_alpha);
        hashMap.put(Share.getInstance().getString(R.string.sort_by_name_desc), R.drawable.ic_sort_by_alpha);
        hashMap.put(Share.getInstance().getString(R.string.sort_by_date_asc), R.drawable.ic_access_time);
        hashMap.put(Share.getInstance().getString(R.string.sort_by_date_desc), R.drawable.ic_access_time);
        return hashMap;
    }

    private ApplicationConstants() {

    }
}
