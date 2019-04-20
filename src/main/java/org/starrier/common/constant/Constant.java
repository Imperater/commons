package org.starrier.common.constant;

/**
 * @author Starrier
 * @date 2019/4/19.
 * <p>
 * Description :
 */
public class Constant {

    /**
     * 敏感词匹配规则
     *
     *  最小匹配规则，如：敏感词库["中国","中国人"]，语句："我是中国人"，匹配结果：我是[中国]人
     *  最大匹配规则，如：敏感词库["中国","中国人"]，语句："我是中国人"，匹配结果：我是[中国人]
     */
    public static final int MinMatchTYpe = 1;

    public static final int MaxMatchType = 2;

}
