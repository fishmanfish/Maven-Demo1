package e3.mall.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author
 * @Package e3.mall.utils
 * @date 2020/12/15 15:20
 * @Copyright
 */
public class DateUtil {

  private final static SimpleDateFormat SHORT_DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd");
  private final static SimpleDateFormat LONG_DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");

  public static String getShortDate(String dateStr){
    if(StringUtil.isNotEmpty(dateStr) && DateUtil.isDate(dateStr)){
      return dateStr.indexOf(" ") > 0 ? dateStr.substring(0, dateStr.indexOf(" ")) : dateStr;
    }
    return "";
  }

  public static boolean isDate(String dateStr){
    if(StringUtil.isNotEmpty(dateStr)){
      dateStr = dateStr.trim();
      return dateStr.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$")
          || dateStr.matches("[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:([0-9]{2}|[0-9]{2}(:[0-9]{1,}|.[0-9]{1,}))$");
    }
    return false;
  }


}
