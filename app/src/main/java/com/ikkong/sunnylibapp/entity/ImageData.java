package com.ikkong.sunnylibapp.entity;

import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:  ikkong
 * Email:   ikkong@163.com
 * Date:    2016/4/19
 * Description:
 */
public class ImageData {

    /**
     * time : 2016-04-19 08:52:18 UTC
     * list : [{"pic":"http://cdn.duitang.com/uploads/blog/201401/07/20140107223310_LH3Uy.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201405/09/20140509222156_kVexJ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201306/14/20130614185903_raNR3.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201112/11/20111211191621_HU4Bj.thumb.jpg"},{"pic":"http://cdn.duitang.com/uploads/item/201408/07/20140807224553_VXaUc.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/29/20140729105929_GQLwC.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201408/04/20140804160432_LnFeB.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201408/04/20140804161101_JVJea.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/blog/201408/04/20140804093210_FxFNd.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201408/04/20140804160314_hRKtv.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/item/201408/01/20140801080524_SnGfE.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/23/20140723140958_NSWfE.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/22/20140722153305_WHejQ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/21/20140721010148_ZBQwe.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/item/201407/23/20140723085122_cmteu.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/23/20140723130620_Z2yJB.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/blog/201407/20/20140720204738_NXxLE.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/item/201407/20/20140720134916_VGfyh.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717113117_mUssJ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717121501_wfFEm.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717121431_w4AV8.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717121918_TtJjY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/11/20140711234806_FNLBQ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/18/20140718121437_UyiAS.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717114829_RiCXR.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/17/20140717120301_wGFYL.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/11/20140511121106_JXS4B.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/10/20140510094144_kfLji.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/09/20140509201906_kERjy.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/08/20140508193226_UaSGB.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201405/05/20140505201747_aPNtf.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/06/20140506104824_jPWQj.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/05/20140505201105_MkXdn.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/03/20140503205822_GCzta.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/03/20140503205535_cCHPB.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/03/20140503204354_xxSQX.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191307_GTxFd.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191247_BG2cU.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191114_MzYtw.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191127_fazJA.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/10/20140710081204_vYnCi.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/15/20140715133758_M2Y3J.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201407/13/20140713190806_TGJHm.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/05/20140705223413_5r3ze.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/13/20140713012526_tcy5u.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/13/20140713121424_Gy43T.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201407/15/20140715033844_tcvrY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/10/20140710181106_4HHay.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/06/20140706122850_8PER3.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/07/20140707192042_8xKXF.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/07/20140707063954_mVa3y.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/08/20140708093733_AFFhc.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/07/20140707161220_unvzn.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/07/20140707113856_hBf3R.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201308/26/20130826090203_NtuYA.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201407/07/20140707145925_dHeKV.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625101534_xiZxN.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201406/30/20140630150534_EWUVY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625121626_ZmT5n.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201307/31/20130731231806_4yGxV.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/28/20140628122218_fLQyP.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201406/26/20140626131831_MrdKP.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201406/16/20140616165201_nuKWj.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625140308_KP4rn.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625121604_2auuA.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201406/25/20140625131625_LmmLZ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625132851_mPmKY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625133312_ZtmW4.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625164858_AuafS.thumb.jpeg"}]
     */

    private DataEntity data;
    /**
     * data : {"time":"2016-04-19 08:52:18 UTC","list":[{"pic":"http://cdn.duitang.com/uploads/blog/201401/07/20140107223310_LH3Uy.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201405/09/20140509222156_kVexJ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201306/14/20130614185903_raNR3.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201112/11/20111211191621_HU4Bj.thumb.jpg"},{"pic":"http://cdn.duitang.com/uploads/item/201408/07/20140807224553_VXaUc.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/29/20140729105929_GQLwC.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201408/04/20140804160432_LnFeB.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201408/04/20140804161101_JVJea.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/blog/201408/04/20140804093210_FxFNd.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201408/04/20140804160314_hRKtv.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/item/201408/01/20140801080524_SnGfE.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/23/20140723140958_NSWfE.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/22/20140722153305_WHejQ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/21/20140721010148_ZBQwe.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/item/201407/23/20140723085122_cmteu.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/23/20140723130620_Z2yJB.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/blog/201407/20/20140720204738_NXxLE.thumb.jpeg"},{"pic":"http://cdn.duitang.com/uploads/item/201407/20/20140720134916_VGfyh.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717113117_mUssJ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717121501_wfFEm.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717121431_w4AV8.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717121918_TtJjY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/11/20140711234806_FNLBQ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/18/20140718121437_UyiAS.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/17/20140717114829_RiCXR.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/17/20140717120301_wGFYL.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/11/20140511121106_JXS4B.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/10/20140510094144_kfLji.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/09/20140509201906_kERjy.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/08/20140508193226_UaSGB.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201405/05/20140505201747_aPNtf.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/06/20140506104824_jPWQj.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/05/20140505201105_MkXdn.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/03/20140503205822_GCzta.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/03/20140503205535_cCHPB.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201405/03/20140503204354_xxSQX.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191307_GTxFd.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191247_BG2cU.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191114_MzYtw.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201404/06/20140406191127_fazJA.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/10/20140710081204_vYnCi.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/15/20140715133758_M2Y3J.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201407/13/20140713190806_TGJHm.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/05/20140705223413_5r3ze.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/13/20140713012526_tcy5u.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/13/20140713121424_Gy43T.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201407/15/20140715033844_tcvrY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/10/20140710181106_4HHay.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/06/20140706122850_8PER3.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/07/20140707192042_8xKXF.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/07/20140707063954_mVa3y.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201407/08/20140708093733_AFFhc.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201407/07/20140707161220_unvzn.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201407/07/20140707113856_hBf3R.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201308/26/20130826090203_NtuYA.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201407/07/20140707145925_dHeKV.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625101534_xiZxN.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201406/30/20140630150534_EWUVY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625121626_ZmT5n.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/blog/201307/31/20130731231806_4yGxV.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/28/20140628122218_fLQyP.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201406/26/20140626131831_MrdKP.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/blog/201406/16/20140616165201_nuKWj.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625140308_KP4rn.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625121604_2auuA.thumb.jpeg"},{"pic":"http://img4.duitang.com/uploads/item/201406/25/20140625131625_LmmLZ.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625132851_mPmKY.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625133312_ZtmW4.thumb.jpeg"},{"pic":"http://img5.duitang.com/uploads/item/201406/25/20140625164858_AuafS.thumb.jpeg"}]}
     * server_time : 2016-04-19 08:52:18
     */

    private String server_time;

    public static ImageData objectFromData(String str) {

        try {
            return new com.google.gson.Gson().fromJson(str, ImageData.class);
        } catch (JsonSyntaxException e) {
            return null;
        }
    }

    public static List<ImageData> arrayImageDataFromData(String str) {

        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ImageData>>() {
        }.getType();

        return new com.google.gson.Gson().fromJson(str, listType);
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getServer_time() {
        return server_time;
    }

    public void setServer_time(String server_time) {
        this.server_time = server_time;
    }

    public static class DataEntity {
        private String time;
        /**
         * pic : http://cdn.duitang.com/uploads/blog/201401/07/20140107223310_LH3Uy.thumb.jpeg
         */

        private List<ListEntity> list;

        public static DataEntity objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str, DataEntity.class);
        }

        public static List<DataEntity> arrayDataEntityFromData(String str) {

            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<DataEntity>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(str, listType);
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<ListEntity> getList() {
            return list;
        }

        public void setList(List<ListEntity> list) {
            this.list = list;
        }

        public static class ListEntity {
            private String pic;

            public static ListEntity objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, ListEntity.class);
            }

            public static List<ListEntity> arrayListEntityFromData(String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ListEntity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }
        }
    }
}
