package com.example.car.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @PackageName: com.example.car.bean
 * @ClassName: SeriesBean
 * @Author: winwa
 * @Date: 2023/4/15 9:41
 * @Description:
 **/
public class SeriesBean implements Serializable {

    /**
     * reason : success
     * result : [{"id":"4175","name":"奥迪Q3 Sportback","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"一汽-大众奥迪"},{"id":"4176","name":"奥迪Q5L Sportback","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"一汽-大众奥迪"},{"id":"4177","name":"奥迪e-tron","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"一汽-大众奥迪"},{"id":"4178","name":"奥迪RS e-tron GT","brandid":"1","levelid":"5","levelname":"中大型车","sname":"Audi Sport"},{"id":"4179","name":"奥迪Q8新能源","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"4512","name":"奥迪A7L","brandid":"1","levelid":"5","levelname":"中大型车","sname":"上汽奥迪"},{"id":"4513","name":"奥迪Concept Shanghai","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"上汽奥迪"},{"id":"4514","name":"奥迪Q3新能源(进口)","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"奥迪(进口)"},{"id":"4819","name":"奥迪Q5 e-tron","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"上汽奥迪"},{"id":"4820","name":"奥迪Q4 e-tron","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"一汽-大众奥迪"},{"id":"4821","name":"skysphere","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"4822","name":"奥迪Q6 e-tron","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"奥迪(进口)"},{"id":"4823","name":"grandsphere","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"4824","name":"URBAN SPHERE","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"1","name":"奥迪A6L新能源","brandid":"1","levelid":"5","levelname":"中大型车","sname":"一汽-大众奥迪"},{"id":"2","name":"奥迪A3","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"一汽-大众奥迪"},{"id":"3","name":"奥迪A4L","brandid":"1","levelid":"4","levelname":"中型车","sname":"一汽-大众奥迪"},{"id":"4","name":"奥迪A6L","brandid":"1","levelid":"5","levelname":"中大型车","sname":"一汽-大众奥迪"},{"id":"5","name":"奥迪Q2L","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"一汽-大众奥迪"},{"id":"6","name":"奥迪Q2L e-tron","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"一汽-大众奥迪"},{"id":"7","name":"奥迪Q3","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"一汽-大众奥迪"},{"id":"8","name":"奥迪Q5L","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"一汽-大众奥迪"},{"id":"9","name":"奥迪Q4","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"一汽-大众奥迪"},{"id":"10","name":"奥迪A4","brandid":"1","levelid":"4","levelname":"中型车","sname":"一汽-大众奥迪"},{"id":"11","name":"奥迪A6","brandid":"1","levelid":"5","levelname":"中大型车","sname":"一汽-大众奥迪"},{"id":"12","name":"奥迪Q5","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"一汽-大众奥迪"},{"id":"13","name":"奥迪RS 3","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"Audi Sport"},{"id":"14","name":"奥迪RS 4","brandid":"1","levelid":"4","levelname":"中型车","sname":"Audi Sport"},{"id":"15","name":"奥迪RS 5","brandid":"1","levelid":"4","levelname":"中型车","sname":"Audi Sport"},{"id":"16","name":"奥迪RS 6","brandid":"1","levelid":"5","levelname":"中大型车","sname":"Audi Sport"},{"id":"17","name":"奥迪RS 7","brandid":"1","levelid":"5","levelname":"中大型车","sname":"Audi Sport"},{"id":"18","name":"奥迪R8","brandid":"1","levelid":"7","levelname":"跑车","sname":"Audi Sport"},{"id":"19","name":"奥迪TT RS","brandid":"1","levelid":"7","levelname":"跑车","sname":"Audi Sport"},{"id":"20","name":"奥迪RS Q3","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"Audi Sport"},{"id":"21","name":"奥迪RS Q8","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"Audi Sport"},{"id":"22","name":"奥迪RS Q e-tron","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"Audi Sport"},{"id":"23","name":"奥迪A3(进口)","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"24","name":"奥迪S3","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"25","name":"奥迪A4(进口)","brandid":"1","levelid":"4","levelname":"中型车","sname":"奥迪(进口)"},{"id":"26","name":"奥迪A5","brandid":"1","levelid":"4","levelname":"中型车","sname":"奥迪(进口)"},{"id":"27","name":"奥迪S4","brandid":"1","levelid":"4","levelname":"中型车","sname":"奥迪(进口)"},{"id":"28","name":"奥迪S5","brandid":"1","levelid":"4","levelname":"中型车","sname":"奥迪(进口)"},{"id":"29","name":"奥迪S6","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"30","name":"奥迪A7","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"31","name":"奥迪S7","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"32","name":"奥迪A8","brandid":"1","levelid":"6","levelname":"大型车","sname":"奥迪(进口)"},{"id":"33","name":"奥迪e-tron(进口)","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"34","name":"奥迪Q7","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"35","name":"奥迪Q7新能源","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"36","name":"奥迪Q8","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"37","name":"奥迪TT","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"38","name":"奥迪TTS","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"39","name":"奥迪A6(进口)","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"40","name":"奥迪A0","brandid":"1","levelid":"1","levelname":"微型车","sname":"奥迪(进口)"},{"id":"41","name":"奥迪A1","brandid":"1","levelid":"2","levelname":"小型车","sname":"奥迪(进口)"},{"id":"42","name":"奥迪S1","brandid":"1","levelid":"2","levelname":"小型车","sname":"奥迪(进口)"},{"id":"43","name":"e-tron Concept","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"44","name":"奥迪AI:ME","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"45","name":"奥迪A6新能源(进口)","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"46","name":"奥迪A7新能源","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"47","name":"奥迪Aicon","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"48","name":"奥迪e-tron GT","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"49","name":"Prologue","brandid":"1","levelid":"6","levelname":"大型车","sname":"奥迪(进口)"},{"id":"50","name":"奥迪A8新能源","brandid":"1","levelid":"6","levelname":"大型车","sname":"奥迪(进口)"},{"id":"51","name":"奥迪A9","brandid":"1","levelid":"6","levelname":"大型车","sname":"奥迪(进口)"},{"id":"52","name":"奥迪S8","brandid":"1","levelid":"6","levelname":"大型车","sname":"奥迪(进口)"},{"id":"53","name":"AI:TRAIL quattro","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"奥迪(进口)"},{"id":"54","name":"allroad","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"奥迪(进口)"},{"id":"55","name":"奥迪Q2","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"奥迪(进口)"},{"id":"56","name":"奥迪SQ2","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"奥迪(进口)"},{"id":"57","name":"奥迪Q3(进口)","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"奥迪(进口)"},{"id":"58","name":"奥迪Q4(进口)","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"奥迪(进口)"},{"id":"59","name":"奥迪Q4 e-tron(进口)","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"奥迪(进口)"},{"id":"60","name":"奥迪TT offroad","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"奥迪(进口)"},{"id":"61","name":"h-tron quattro","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"奥迪(进口)"},{"id":"62","name":"奥迪Elaine","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"奥迪(进口)"},{"id":"63","name":"奥迪Q5(进口)","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"奥迪(进口)"},{"id":"64","name":"奥迪Q5新能源(进口)","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"奥迪(进口)"},{"id":"65","name":"奥迪SQ5","brandid":"1","levelid":"18","levelname":"中型SUV","sname":"奥迪(进口)"},{"id":"66","name":"奥迪SQ7","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"67","name":"奥迪SQ8","brandid":"1","levelid":"19","levelname":"中大型SUV","sname":"奥迪(进口)"},{"id":"68","name":"奥迪Q9","brandid":"1","levelid":"20","levelname":"大型SUV","sname":"奥迪(进口)"},{"id":"69","name":"e-tron Vision Gran Turismo","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"70","name":"quattro","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"71","name":"奥迪PB18","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"72","name":"奥迪R18","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"},{"id":"73","name":"奥迪Urban","brandid":"1","levelid":"1","levelname":"微型车","sname":"奥迪(进口)"},{"id":"74","name":"奥迪A2","brandid":"1","levelid":"2","levelname":"小型车","sname":"奥迪(进口)"},{"id":"75","name":"奥迪80","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"76","name":"奥迪A3新能源(进口)","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"77","name":"奥迪Coupe","brandid":"1","levelid":"3","levelname":"紧凑型车","sname":"奥迪(进口)"},{"id":"78","name":"奥迪100","brandid":"1","levelid":"5","levelname":"中大型车","sname":"奥迪(进口)"},{"id":"79","name":"Crosslane Coupe","brandid":"1","levelid":"16","levelname":"小型SUV","sname":"奥迪(进口)"},{"id":"80","name":"奥迪Cross","brandid":"1","levelid":"17","levelname":"紧凑型SUV","sname":"奥迪(进口)"},{"id":"81","name":"Nanuk","brandid":"1","levelid":"7","levelname":"跑车","sname":"奥迪(进口)"}]
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

    public static class ResultBean implements Serializable {
        /**
         * id : 4175
         * name : 奥迪Q3 Sportback
         * brandid : 1
         * levelid : 17
         * levelname : 紧凑型SUV
         * sname : 一汽-大众奥迪
         */

        private String id;
        private String name;
        private String brandid;
        private String levelid;
        private String levelname;
        private String sname;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrandid() {
            return brandid;
        }

        public void setBrandid(String brandid) {
            this.brandid = brandid;
        }

        public String getLevelid() {
            return levelid;
        }

        public void setLevelid(String levelid) {
            this.levelid = levelid;
        }

        public String getLevelname() {
            return levelname;
        }

        public void setLevelname(String levelname) {
            this.levelname = levelname;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }
    }
}
