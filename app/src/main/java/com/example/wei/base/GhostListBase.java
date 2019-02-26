package com.example.wei.base;

import java.util.List;

/**
 * Created by wei on 2019/1/4.
 */

public class GhostListBase {


    /**
     * showapi_res_error :
     * showapi_res_id : e84fdf3f9fd846f8889fa2aed98e9d5f
     * showapi_res_code : 0
     * showapi_res_body : {"ret_code":0,"pagebean":{"contentlist":[{"link":"/dp/52391.html","title":"橡皮泥","desc":"最近一段时间，莲花的睡眠质量特别不好。也不知怎么了，一旦睡着，她就觉得憋闷得不行，就像自己的鼻子和嘴巴都被捂住了一样，常常会让她非常痛苦地醒来。有时候，她甚至觉得自己几乎要在睡梦中被闷死了。可是只要醒过来，那种憋闷的感觉就会立刻荡然无存。"},{"link":"/dp/52386.html","title":"不要随便纹身","desc":"经历过灵异事件的，坚信这世上有鬼神存在，而像我这样从没有遇见过科学不能解释事情的人，多是保存着半信半疑的态度，有没有鬼我不知道，但是有些说道不信不行。就比如说纹身，这些年越发常见，女孩子多喜欢纹些漂亮的图案在皮肤上，大多是手臂与后背腰间，大胆些的会在胸口处纹一朵妖冶的花朵，穿着低胸装时，更显妩媚风情。"},{"link":"/dp/52384.html","title":"女鬼惊魂","desc":"午夜，张宏还在忙碌着。他是一名出租车司机，夜半出车早已是家常便饭，这夜，一如既往。张宏抽着劣质的兰州烟，等着看有没有搭车的乘客。烟抽到最终，全是淡淡的苦涩味。他朝车窗外咳了一声，吐了浓痰。"},{"link":"/dp/52370.html","title":"真实鬼故事三则","desc":"他说在印尼爪哇，有一种山精，长得很像猴子，但是却双足直立，有自己的部落，但是族群不会太多。开始我以为他说的是大脚怪，但他说没有那么高，和普通人差不多的体格，但是力气大，移动迅速，没人能捉得到。"},{"link":"/dp/52364.html","title":"孽缘","desc":"半个月前，刘洋在无意间撞见妻子将一张泛黄的保险理赔单仓惶地放进保险柜里时，刘洋心中就有了隐隐的不安，或许应该发生点什么事，让这个女人消失在自己的眼前。刘洋知道，如果追问下去，只会徒增不悦，妻子的泼辣无理是出了名的。"},{"link":"/dp/52359.html","title":"谁是下一个","desc":"这个世界上有很多奇怪的人，奇怪的事，也有很多无法用科学解释的东西。而你要做的，就是控制自己的贪欲。因为，一旦欲望之门打开，你不知道自己面对的到底是什么，也不懂自己即将失去的，会不会是自己的性命。"},{"link":"/dp/52354.html","title":"锁魂劫","desc":"\u201c我们费了九牛二虎之力进了这墓室，难不成竹篮打水一场空？\u201d张龙垂头丧气地摸了下脑袋，脸上的表情非常失望。冷叔眯眼看了看这黑幽空荡的墓室，吩咐身后的女子： \u201c阿菊，你看这里面有没有不干净的东西！\u201d"},{"link":"/dp/52349.html","title":"叫你一声","desc":"我追着一个游魂来到一座破旧的房子前，只一瞬间，那游魂就在我眼前消失不见了。我知道它其实没有走远，因为周围还残留着一丝阴气。我追这个东西已经一个月了，它的障眼法总能让它在生死关头逃走。我是留它不得的，这东西害人无数，如果不尽早铲除，留着始终是个祸害。"},{"link":"/dp/52348.html","title":"安全帽","desc":"\u201c差安全帽，差安全帽。\u201d张晨辉再一次被梦里的那个声音惊醒。他看不清那个人的脸，但他隐约能猜出，这个人是前几天出事的那个员工。张晨辉是一个建筑工地的总负责人，根据工头的说法，那名员工是被坠物砸中头部死亡的。"},{"link":"/dp/52346.html","title":"冥鬼","desc":"有没有听过这样一个传说，在午夜12点时，拿起电话拨12个0，这样电话就可以通向冥界。由于常常熬夜上网，所以我经常会心绪不定，有时候总是走神儿。有一天晚上，不知为何就想起了午夜12点的这个恐怖传说。"}],"allPages":"563","maxResult":"10"}}
     */

    private String showapi_res_error;
    private String showapi_res_id;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public String getShowapi_res_id() {
        return showapi_res_id;
    }

    public void setShowapi_res_id(String showapi_res_id) {
        this.showapi_res_id = showapi_res_id;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * ret_code : 0
         * pagebean : {"contentlist":[{"link":"/dp/52391.html","title":"橡皮泥","desc":"最近一段时间，莲花的睡眠质量特别不好。也不知怎么了，一旦睡着，她就觉得憋闷得不行，就像自己的鼻子和嘴巴都被捂住了一样，常常会让她非常痛苦地醒来。有时候，她甚至觉得自己几乎要在睡梦中被闷死了。可是只要醒过来，那种憋闷的感觉就会立刻荡然无存。"},{"link":"/dp/52386.html","title":"不要随便纹身","desc":"经历过灵异事件的，坚信这世上有鬼神存在，而像我这样从没有遇见过科学不能解释事情的人，多是保存着半信半疑的态度，有没有鬼我不知道，但是有些说道不信不行。就比如说纹身，这些年越发常见，女孩子多喜欢纹些漂亮的图案在皮肤上，大多是手臂与后背腰间，大胆些的会在胸口处纹一朵妖冶的花朵，穿着低胸装时，更显妩媚风情。"},{"link":"/dp/52384.html","title":"女鬼惊魂","desc":"午夜，张宏还在忙碌着。他是一名出租车司机，夜半出车早已是家常便饭，这夜，一如既往。张宏抽着劣质的兰州烟，等着看有没有搭车的乘客。烟抽到最终，全是淡淡的苦涩味。他朝车窗外咳了一声，吐了浓痰。"},{"link":"/dp/52370.html","title":"真实鬼故事三则","desc":"他说在印尼爪哇，有一种山精，长得很像猴子，但是却双足直立，有自己的部落，但是族群不会太多。开始我以为他说的是大脚怪，但他说没有那么高，和普通人差不多的体格，但是力气大，移动迅速，没人能捉得到。"},{"link":"/dp/52364.html","title":"孽缘","desc":"半个月前，刘洋在无意间撞见妻子将一张泛黄的保险理赔单仓惶地放进保险柜里时，刘洋心中就有了隐隐的不安，或许应该发生点什么事，让这个女人消失在自己的眼前。刘洋知道，如果追问下去，只会徒增不悦，妻子的泼辣无理是出了名的。"},{"link":"/dp/52359.html","title":"谁是下一个","desc":"这个世界上有很多奇怪的人，奇怪的事，也有很多无法用科学解释的东西。而你要做的，就是控制自己的贪欲。因为，一旦欲望之门打开，你不知道自己面对的到底是什么，也不懂自己即将失去的，会不会是自己的性命。"},{"link":"/dp/52354.html","title":"锁魂劫","desc":"\u201c我们费了九牛二虎之力进了这墓室，难不成竹篮打水一场空？\u201d张龙垂头丧气地摸了下脑袋，脸上的表情非常失望。冷叔眯眼看了看这黑幽空荡的墓室，吩咐身后的女子： \u201c阿菊，你看这里面有没有不干净的东西！\u201d"},{"link":"/dp/52349.html","title":"叫你一声","desc":"我追着一个游魂来到一座破旧的房子前，只一瞬间，那游魂就在我眼前消失不见了。我知道它其实没有走远，因为周围还残留着一丝阴气。我追这个东西已经一个月了，它的障眼法总能让它在生死关头逃走。我是留它不得的，这东西害人无数，如果不尽早铲除，留着始终是个祸害。"},{"link":"/dp/52348.html","title":"安全帽","desc":"\u201c差安全帽，差安全帽。\u201d张晨辉再一次被梦里的那个声音惊醒。他看不清那个人的脸，但他隐约能猜出，这个人是前几天出事的那个员工。张晨辉是一个建筑工地的总负责人，根据工头的说法，那名员工是被坠物砸中头部死亡的。"},{"link":"/dp/52346.html","title":"冥鬼","desc":"有没有听过这样一个传说，在午夜12点时，拿起电话拨12个0，这样电话就可以通向冥界。由于常常熬夜上网，所以我经常会心绪不定，有时候总是走神儿。有一天晚上，不知为何就想起了午夜12点的这个恐怖传说。"}],"allPages":"563","maxResult":"10"}
         */

        private int ret_code;
        private PagebeanBean pagebean;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public static class PagebeanBean {
            /**
             * contentlist : [{"link":"/dp/52391.html","title":"橡皮泥","desc":"最近一段时间，莲花的睡眠质量特别不好。也不知怎么了，一旦睡着，她就觉得憋闷得不行，就像自己的鼻子和嘴巴都被捂住了一样，常常会让她非常痛苦地醒来。有时候，她甚至觉得自己几乎要在睡梦中被闷死了。可是只要醒过来，那种憋闷的感觉就会立刻荡然无存。"},{"link":"/dp/52386.html","title":"不要随便纹身","desc":"经历过灵异事件的，坚信这世上有鬼神存在，而像我这样从没有遇见过科学不能解释事情的人，多是保存着半信半疑的态度，有没有鬼我不知道，但是有些说道不信不行。就比如说纹身，这些年越发常见，女孩子多喜欢纹些漂亮的图案在皮肤上，大多是手臂与后背腰间，大胆些的会在胸口处纹一朵妖冶的花朵，穿着低胸装时，更显妩媚风情。"},{"link":"/dp/52384.html","title":"女鬼惊魂","desc":"午夜，张宏还在忙碌着。他是一名出租车司机，夜半出车早已是家常便饭，这夜，一如既往。张宏抽着劣质的兰州烟，等着看有没有搭车的乘客。烟抽到最终，全是淡淡的苦涩味。他朝车窗外咳了一声，吐了浓痰。"},{"link":"/dp/52370.html","title":"真实鬼故事三则","desc":"他说在印尼爪哇，有一种山精，长得很像猴子，但是却双足直立，有自己的部落，但是族群不会太多。开始我以为他说的是大脚怪，但他说没有那么高，和普通人差不多的体格，但是力气大，移动迅速，没人能捉得到。"},{"link":"/dp/52364.html","title":"孽缘","desc":"半个月前，刘洋在无意间撞见妻子将一张泛黄的保险理赔单仓惶地放进保险柜里时，刘洋心中就有了隐隐的不安，或许应该发生点什么事，让这个女人消失在自己的眼前。刘洋知道，如果追问下去，只会徒增不悦，妻子的泼辣无理是出了名的。"},{"link":"/dp/52359.html","title":"谁是下一个","desc":"这个世界上有很多奇怪的人，奇怪的事，也有很多无法用科学解释的东西。而你要做的，就是控制自己的贪欲。因为，一旦欲望之门打开，你不知道自己面对的到底是什么，也不懂自己即将失去的，会不会是自己的性命。"},{"link":"/dp/52354.html","title":"锁魂劫","desc":"\u201c我们费了九牛二虎之力进了这墓室，难不成竹篮打水一场空？\u201d张龙垂头丧气地摸了下脑袋，脸上的表情非常失望。冷叔眯眼看了看这黑幽空荡的墓室，吩咐身后的女子： \u201c阿菊，你看这里面有没有不干净的东西！\u201d"},{"link":"/dp/52349.html","title":"叫你一声","desc":"我追着一个游魂来到一座破旧的房子前，只一瞬间，那游魂就在我眼前消失不见了。我知道它其实没有走远，因为周围还残留着一丝阴气。我追这个东西已经一个月了，它的障眼法总能让它在生死关头逃走。我是留它不得的，这东西害人无数，如果不尽早铲除，留着始终是个祸害。"},{"link":"/dp/52348.html","title":"安全帽","desc":"\u201c差安全帽，差安全帽。\u201d张晨辉再一次被梦里的那个声音惊醒。他看不清那个人的脸，但他隐约能猜出，这个人是前几天出事的那个员工。张晨辉是一个建筑工地的总负责人，根据工头的说法，那名员工是被坠物砸中头部死亡的。"},{"link":"/dp/52346.html","title":"冥鬼","desc":"有没有听过这样一个传说，在午夜12点时，拿起电话拨12个0，这样电话就可以通向冥界。由于常常熬夜上网，所以我经常会心绪不定，有时候总是走神儿。有一天晚上，不知为何就想起了午夜12点的这个恐怖传说。"}]
             * allPages : 563
             * maxResult : 10
             */

            private String allPages;
            private String maxResult;
            private List<ContentlistBean> contentlist;

            public String getAllPages() {
                return allPages;
            }

            public void setAllPages(String allPages) {
                this.allPages = allPages;
            }

            public String getMaxResult() {
                return maxResult;
            }

            public void setMaxResult(String maxResult) {
                this.maxResult = maxResult;
            }

            public List<ContentlistBean> getContentlist() {
                return contentlist;
            }

            public void setContentlist(List<ContentlistBean> contentlist) {
                this.contentlist = contentlist;
            }

            public static class ContentlistBean {
                /**
                 * link : /dp/52391.html
                 * title : 橡皮泥
                 * desc : 最近一段时间，莲花的睡眠质量特别不好。也不知怎么了，一旦睡着，她就觉得憋闷得不行，就像自己的鼻子和嘴巴都被捂住了一样，常常会让她非常痛苦地醒来。有时候，她甚至觉得自己几乎要在睡梦中被闷死了。可是只要醒过来，那种憋闷的感觉就会立刻荡然无存。
                 */

                private String link;
                private String title;
                private String desc;

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }
            }
        }
    }
}
