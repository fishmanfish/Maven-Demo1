package e3.mall.utils;

/**
 * @author
 * @Package e3.mall.utils
 * @date 2020/12/16 10:32
 * @Copyright
 */
public class StringUtil {

  public static boolean isEmpty(String str){
    if("".equals(str) || str == null)
      return true;
    else
      return false;
  }

  public static boolean isNotEmpty(String str){
    return !StringUtil.isEmpty(str);
  }
}
