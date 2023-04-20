package jdktest;

import java.util.StringTokenizer;

/**
 * @className: a01StringtokenizerTEst
 * @author: zhaoyepeng
 * @date: 2023-04-20 09:24:46
 * https://blog.csdn.net/weixin_36462703/article/details/114208224
 * 功效:将字符串以定界符为界，分析为一个个的token(可理解为单词)，定界符可以自己指定。
 * <p>
 * 构造函数。
 * 01.StringTokenizer(String str)：构造一个用来解析str的StringTokenizer对象。
 * java默认的分隔符是“空格”、“制表符(‘\t’)”、“换行符(‘\n’)”、“回车符(‘\r’)”。
 * <p>
 * 2.StringTokenizer(String str, String delim)：构造一个用来解析str的StringTokenizer对象，
 * 并提供一个指定的分隔符。如new StringTokenizer("A|001:B|002:C|003",":");
 * <p>
 * 3.StringTokenizer(String str, String delim, boolean returnDelims)：
 * 构造一个用来解析str的StringTokenizer对象，并提供一个指定的分隔符，同时，指定是否返回分隔符。
 * <p>
 * 原文链接：https://blog.csdn.net/weixin_36462703/article/details/114208224
 **/
public class a01StringtokenizerTEst {
    public static void main(String[] args) {
        String s = new String("The,Java,platform,is,the,ideal,platform");
        //boolean returnDelims默认是false，true是计算分隔符，计数的时候也计算分隔符的数量
        StringTokenizer stringTokenizer = new StringTokenizer(s, ",",true);
        //打印StringTokenizer中单词总数，包含分隔符（如本例的逗号(,)）,下面结果是13，前提是第三个参数是true
        System.out.println(stringTokenizer.countTokens());
        //遍历StringTokenizer，包含分隔符,下面便利打印内容为
        // The,Java,platform,is,the,ideal,platform
        while (stringTokenizer.hasMoreElements()) {
            System.out.print(stringTokenizer.nextToken());
        }

        /**
         * 下面分析构造函数的不同
         */

        String str = "100|66,55:200|567,90:102|43,54";
        String abc = "A|B|C|D";
        //默认不打印分隔符，下面结果是3，但是没有打印出来
        StringTokenizer strToke = new StringTokenizer(str, ":");
        int i = strToke.countTokens();
        System.out.println(strToke.countTokens());
        while (strToke.hasMoreElements()){
            //只打印遍历出来的元素
            System.out.print(strToke.nextElement());
        }
        //strToke.nextToken()会打印出来分隔符
        //打印分隔符，下面结果是5
        strToke = new StringTokenizer(str, ":", true);
        System.out.println(strToke.countTokens());
        //不打印分隔符，下面结果是3
        strToke = new StringTokenizer(str, ":", false);
        System.out.println(strToke.countTokens());

    }
}
