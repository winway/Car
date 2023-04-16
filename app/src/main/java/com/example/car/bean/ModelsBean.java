package com.example.car.bean;

import java.util.List;

/**
 * @PackageName: com.example.car.bean
 * @ClassName: ModelsBean
 * @Author: winwa
 * @Date: 2023/4/15 9:44
 * @Description:
 **/
public class ModelsBean {

    /**
     * reason : success
     * result : [{"id":"49392","series_id":"1","name":"2022款 55 TFSI e quattro","year":"2022","peizhi":""},{"id":"37174","series_id":"1","name":"2021款 55 TFSI e quattro","year":"2021","peizhi":""},{"id":"1","series_id":"1","name":"2020款 55 TFSI e quattro","year":"2020","peizhi":"2.0升 涡轮增压 252马力 国VI"},{"id":"2","series_id":"1","name":"2018款 40 e-tron","year":"2018","peizhi":"2.0升 211马力"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 49392
         * series_id : 1
         * name : 2022款 55 TFSI e quattro
         * year : 2022
         * peizhi :
         */

        private String id;
        private String series_id;
        private String name;
        private String year;
        private String peizhi;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSeries_id() {
            return series_id;
        }

        public void setSeries_id(String series_id) {
            this.series_id = series_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getPeizhi() {
            return peizhi;
        }

        public void setPeizhi(String peizhi) {
            this.peizhi = peizhi;
        }
    }
}
