package com.example.wei.base;

import java.util.List;

/**
 * Created by wei on 2019/1/2.
 */

public class RecreationBase {


    /**
     * showapi_res_error :
     * showapi_res_id : 21b6984f4a1e46e78c8b91c9045c7996
     * showapi_res_code : 0
     * showapi_res_body : {"allPages":1913,"ret_code":0,"contentlist":[{"id":"5c17e4256e36c7cf12bc6a13","title":"这么机智的办法","img":"http://sc0.hao123img.com/data/2018-12-13/3_2d367dda33f6904c3b5894a885814060_430","type":2,"ct":"2018-12-18 02:00:05.960"},{"id":"5c1541266e36c7cf12bb745f","title":"哼，一点耐心都没有","img":"http://sc4.hao123img.com/data/2018-12-13/3_b9d7221c188d071d644d0a91c16b4c52_430","type":2,"ct":"2018-12-16 02:00:06.189"},{"id":"5c13efa56e36c7cf12bb0827","title":"真心没搞懂，这哥们难道从天而降的吗？","img":"http://sc3.hao123img.com/data/2018-12-13/3_9ae559dd6831ee0465928ff07e19a55d_430","type":2,"ct":"2018-12-15 02:00:05.955"},{"id":"5c129e266e36c7cf12baa2c9","title":"纸盒好创意啊！","img":"http://sc0.hao123img.com/data/2018-12-13/3_a27af72aa57204469deff211da7377d4_430","type":2,"ct":"2018-12-14 02:00:06.043"},{"id":"5c021c606e36119f2a0a4264","title":"爆笑的GIF动态图：单身久了连看海星都会有想法","img":"https://www.zbjuran.com/uploads/20181201/egr53ebpbvn27.jpg","type":2,"ct":"2018-12-01 13:30:08.563"},{"id":"5c00ee0a6e36119f2a099a39","title":"丈母娘叫我小儿子","img":"https://www.zbjuran.com/uploads/allimg/181130/2-1Q130152P3Q2.jpg","type":2,"ct":"2018-11-30 16:00:10.886"},{"id":"5c00ee0a6e36119f2a099a38","title":"飞不动就走，没毛病啊","img":"https://www.zbjuran.com/uploads/allimg/181130/2-1Q13015404A63.jpg","type":2,"ct":"2018-11-30 16:00:10.831"},{"id":"5c00e6ff6e36119f2a099860","title":"论拍照位置的重要性","img":"https://www.zbjuran.com/uploads/allimg/181130/2-1Q130150212419.png","type":2,"ct":"2018-11-30 15:30:07.888"},{"id":"5bff5d446e36119f2a08f1c1","title":"捧友们，请用一句话评论我的家","img":"https://www.zbjuran.com/uploads/allimg/181129/2-1Q129111255953.jpg","type":2,"ct":"2018-11-29 11:30:12.002"},{"id":"5bff5d436e36119f2a08f1bf","title":"路人还是主持公道的","img":"https://www.zbjuran.com/uploads/allimg/181129/2-1Q129111439314.jpg","type":2,"ct":"2018-11-29 11:30:11.963"},{"id":"5bf4449f6e36269c54f67d0a","title":"一元撩妹法了解一下","img":"http://sc0.hao123img.com/data/2018-11-20/3_edb02bba24ff811856e8314612fcfd21_430","type":2,"ct":"2018-11-21 01:30:07.168"},{"id":"5befbc7d6e36269c54f50528","title":"可爱的象鼻鱼，见到的都要快乐哦！","img":"https://www.zbjuran.com/uploads/allimg/181117/2-1Q11G45030432.jpg","type":2,"ct":"2018-11-17 15:00:13.065"},{"id":"5bee42166e36269c54f476b5","title":"太他妈感动了","img":"https://www.zbjuran.com/uploads/allimg/181116/2-1Q1161133531U.jpg","type":2,"ct":"2018-11-16 12:05:42.343"},{"id":"5bee39c36e36269c54f47484","title":"姐姐摔了一跤","img":"https://www.zbjuran.com/uploads/allimg/181116/2-1Q1161103492E.jpg","type":2,"ct":"2018-11-16 11:30:11.474"},{"id":"5bee39c36e36269c54f47483","title":"好犀利的表扬信","img":"https://www.zbjuran.com/uploads/allimg/181116/2-1Q116111A0P5.jpg","type":2,"ct":"2018-11-16 11:30:11.473"},{"id":"5bed27896e36269c54f3ee2b","title":"来自我内心的呐喊","img":"https://www.zbjuran.com/uploads/allimg/181115/2-1Q115153224913.jpg","type":2,"ct":"2018-11-15 16:00:09.065"},{"id":"5bed20816e36269c54f3ebb2","title":"好吓人","img":"https://www.zbjuran.com/uploads/allimg/181115/2-1Q115152130X6.jpg","type":2,"ct":"2018-11-15 15:30:09.569"},{"id":"5bed20816e36269c54f3ebb1","title":"实用的套路","img":"https://www.zbjuran.com/uploads/allimg/181115/2-1Q115152235Q7.jpg","type":2,"ct":"2018-11-15 15:30:09.567"},{"id":"5be9725e6e36452597a9fabb","title":"论学区房的重要性","img":"https://www.zbjuran.com/uploads/allimg/181112/2-1Q11220130A95.jpg","type":2,"ct":"2018-11-12 20:30:22.174"},{"id":"5be82ee86e36452597a977c5","title":"有这耐心不简单啊","img":"https://www.zbjuran.com/uploads/allimg/181111/2-1Q11121151J46.jpg","type":2,"ct":"2018-11-11 21:30:16.513"}],"currentPage":1,"allNum":38252,"maxResult":20}
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
         * allPages : 1913
         * ret_code : 0
         * contentlist : [{"id":"5c17e4256e36c7cf12bc6a13","title":"这么机智的办法","img":"http://sc0.hao123img.com/data/2018-12-13/3_2d367dda33f6904c3b5894a885814060_430","type":2,"ct":"2018-12-18 02:00:05.960"},{"id":"5c1541266e36c7cf12bb745f","title":"哼，一点耐心都没有","img":"http://sc4.hao123img.com/data/2018-12-13/3_b9d7221c188d071d644d0a91c16b4c52_430","type":2,"ct":"2018-12-16 02:00:06.189"},{"id":"5c13efa56e36c7cf12bb0827","title":"真心没搞懂，这哥们难道从天而降的吗？","img":"http://sc3.hao123img.com/data/2018-12-13/3_9ae559dd6831ee0465928ff07e19a55d_430","type":2,"ct":"2018-12-15 02:00:05.955"},{"id":"5c129e266e36c7cf12baa2c9","title":"纸盒好创意啊！","img":"http://sc0.hao123img.com/data/2018-12-13/3_a27af72aa57204469deff211da7377d4_430","type":2,"ct":"2018-12-14 02:00:06.043"},{"id":"5c021c606e36119f2a0a4264","title":"爆笑的GIF动态图：单身久了连看海星都会有想法","img":"https://www.zbjuran.com/uploads/20181201/egr53ebpbvn27.jpg","type":2,"ct":"2018-12-01 13:30:08.563"},{"id":"5c00ee0a6e36119f2a099a39","title":"丈母娘叫我小儿子","img":"https://www.zbjuran.com/uploads/allimg/181130/2-1Q130152P3Q2.jpg","type":2,"ct":"2018-11-30 16:00:10.886"},{"id":"5c00ee0a6e36119f2a099a38","title":"飞不动就走，没毛病啊","img":"https://www.zbjuran.com/uploads/allimg/181130/2-1Q13015404A63.jpg","type":2,"ct":"2018-11-30 16:00:10.831"},{"id":"5c00e6ff6e36119f2a099860","title":"论拍照位置的重要性","img":"https://www.zbjuran.com/uploads/allimg/181130/2-1Q130150212419.png","type":2,"ct":"2018-11-30 15:30:07.888"},{"id":"5bff5d446e36119f2a08f1c1","title":"捧友们，请用一句话评论我的家","img":"https://www.zbjuran.com/uploads/allimg/181129/2-1Q129111255953.jpg","type":2,"ct":"2018-11-29 11:30:12.002"},{"id":"5bff5d436e36119f2a08f1bf","title":"路人还是主持公道的","img":"https://www.zbjuran.com/uploads/allimg/181129/2-1Q129111439314.jpg","type":2,"ct":"2018-11-29 11:30:11.963"},{"id":"5bf4449f6e36269c54f67d0a","title":"一元撩妹法了解一下","img":"http://sc0.hao123img.com/data/2018-11-20/3_edb02bba24ff811856e8314612fcfd21_430","type":2,"ct":"2018-11-21 01:30:07.168"},{"id":"5befbc7d6e36269c54f50528","title":"可爱的象鼻鱼，见到的都要快乐哦！","img":"https://www.zbjuran.com/uploads/allimg/181117/2-1Q11G45030432.jpg","type":2,"ct":"2018-11-17 15:00:13.065"},{"id":"5bee42166e36269c54f476b5","title":"太他妈感动了","img":"https://www.zbjuran.com/uploads/allimg/181116/2-1Q1161133531U.jpg","type":2,"ct":"2018-11-16 12:05:42.343"},{"id":"5bee39c36e36269c54f47484","title":"姐姐摔了一跤","img":"https://www.zbjuran.com/uploads/allimg/181116/2-1Q1161103492E.jpg","type":2,"ct":"2018-11-16 11:30:11.474"},{"id":"5bee39c36e36269c54f47483","title":"好犀利的表扬信","img":"https://www.zbjuran.com/uploads/allimg/181116/2-1Q116111A0P5.jpg","type":2,"ct":"2018-11-16 11:30:11.473"},{"id":"5bed27896e36269c54f3ee2b","title":"来自我内心的呐喊","img":"https://www.zbjuran.com/uploads/allimg/181115/2-1Q115153224913.jpg","type":2,"ct":"2018-11-15 16:00:09.065"},{"id":"5bed20816e36269c54f3ebb2","title":"好吓人","img":"https://www.zbjuran.com/uploads/allimg/181115/2-1Q115152130X6.jpg","type":2,"ct":"2018-11-15 15:30:09.569"},{"id":"5bed20816e36269c54f3ebb1","title":"实用的套路","img":"https://www.zbjuran.com/uploads/allimg/181115/2-1Q115152235Q7.jpg","type":2,"ct":"2018-11-15 15:30:09.567"},{"id":"5be9725e6e36452597a9fabb","title":"论学区房的重要性","img":"https://www.zbjuran.com/uploads/allimg/181112/2-1Q11220130A95.jpg","type":2,"ct":"2018-11-12 20:30:22.174"},{"id":"5be82ee86e36452597a977c5","title":"有这耐心不简单啊","img":"https://www.zbjuran.com/uploads/allimg/181111/2-1Q11121151J46.jpg","type":2,"ct":"2018-11-11 21:30:16.513"}]
         * currentPage : 1
         * allNum : 38252
         * maxResult : 20
         */

        private int allPages;
        private int ret_code;
        private int currentPage;
        private int allNum;
        private int maxResult;
        private List<ContentlistBean> contentlist;

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
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
             * id : 5c17e4256e36c7cf12bc6a13
             * title : 这么机智的办法
             * img : http://sc0.hao123img.com/data/2018-12-13/3_2d367dda33f6904c3b5894a885814060_430
             * type : 2
             * ct : 2018-12-18 02:00:05.960
             */

            private String id;
            private String title;
            private String img;
            private int type;
            private String ct;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }
        }
    }
}
