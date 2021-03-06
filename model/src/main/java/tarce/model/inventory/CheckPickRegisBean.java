package tarce.model.inventory;

import java.util.List;

/**
 * Created by rose.zou on 2017/5/26.
 */

public class CheckPickRegisBean {
    /**
     * jsonrpc : 2.0
     * id : null
     * result : {"res_data":{"origin":"; MO/2017041831617:MO/2017041831617; SO2017032101307:MO/2017042033386; SO2017030601019:MO/2017042035027; SO2017032301355:MO/2017042136990","remark":"5048单","prepare_material_area_id":{"area_id":false,"area_name":false},"display_name":"MO1705231869","product_id":{"product_ll_type":"raw material","area_id":{"area_id":false,"area_name":false},"product_id":69809,"product_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2"},"production_order_type":"stockup","order_id":47726,"sale_remark":"","qty_produced":0,"cur_location":null,"stock_move_lines":[{"quantity_ready":0,"virtual_available":0,"product_id":"[CY.0DZ080.001] 冲压制程品-DZ08-木板(引擎)-2-1+2","suggest_qty":1545,"product_uom_qty":1500,"order_id":47726,"return_qty":0,"product_tmpl_id":67292,"product_type":"semi-finished","quantity_available":0,"qty_available":1190,"quantity_done":310,"id":86156,"over_picking_qty":0}],"state":"already_picking","process_id":{"process_id":8,"name":"全检","is_rework":false},"bom_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2","feedback_on_rework":{"feedback_id":false,"name":null},"product_qty":1500,"in_charge_name":"陈小娟","date_planned_start":"2017-05-23 14:29:51","product_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2","is_pending":false,"prepare_material_img":"http://192.168.2.36:8069/linkloving_app_api/get_worker_image?worker_id=47726&model=mrp.production&field=prepare_material_img"},"res_msg":"","res_code":1}
     */

    private String jsonrpc;
    private Object id;
    private ResultBean result;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * res_data : {"origin":"; MO/2017041831617:MO/2017041831617; SO2017032101307:MO/2017042033386; SO2017030601019:MO/2017042035027; SO2017032301355:MO/2017042136990","remark":"5048单","prepare_material_area_id":{"area_id":false,"area_name":false},"display_name":"MO1705231869","product_id":{"product_ll_type":"raw material","area_id":{"area_id":false,"area_name":false},"product_id":69809,"product_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2"},"production_order_type":"stockup","order_id":47726,"sale_remark":"","qty_produced":0,"cur_location":null,"stock_move_lines":[{"quantity_ready":0,"virtual_available":0,"product_id":"[CY.0DZ080.001] 冲压制程品-DZ08-木板(引擎)-2-1+2","suggest_qty":1545,"product_uom_qty":1500,"order_id":47726,"return_qty":0,"product_tmpl_id":67292,"product_type":"semi-finished","quantity_available":0,"qty_available":1190,"quantity_done":310,"id":86156,"over_picking_qty":0}],"state":"already_picking","process_id":{"process_id":8,"name":"全检","is_rework":false},"bom_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2","feedback_on_rework":{"feedback_id":false,"name":null},"product_qty":1500,"in_charge_name":"陈小娟","date_planned_start":"2017-05-23 14:29:51","product_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2","is_pending":false,"prepare_material_img":"http://192.168.2.36:8069/linkloving_app_api/get_worker_image?worker_id=47726&model=mrp.production&field=prepare_material_img"}
         * res_msg :
         * res_code : 1
         */

        private ResDataBean res_data;
        private String res_msg;
        private int res_code;

        public ResDataBean getRes_data() {
            return res_data;
        }

        public void setRes_data(ResDataBean res_data) {
            this.res_data = res_data;
        }

        public String getRes_msg() {
            return res_msg;
        }

        public void setRes_msg(String res_msg) {
            this.res_msg = res_msg;
        }

        public int getRes_code() {
            return res_code;
        }

        public void setRes_code(int res_code) {
            this.res_code = res_code;
        }

        public static class ResDataBean {
            /**
             * origin : ; MO/2017041831617:MO/2017041831617; SO2017032101307:MO/2017042033386; SO2017030601019:MO/2017042035027; SO2017032301355:MO/2017042136990
             * remark : 5048单
             * prepare_material_area_id : {"area_id":false,"area_name":false}
             * display_name : MO1705231869
             * product_id : {"product_ll_type":"raw material","area_id":{"area_id":false,"area_name":false},"product_id":69809,"product_name":"[QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2"}
             * production_order_type : stockup
             * order_id : 47726
             * sale_remark :
             * qty_produced : 0.0
             * cur_location : null
             * stock_move_lines : [{"quantity_ready":0,"virtual_available":0,"product_id":"[CY.0DZ080.001] 冲压制程品-DZ08-木板(引擎)-2-1+2","suggest_qty":1545,"product_uom_qty":1500,"order_id":47726,"return_qty":0,"product_tmpl_id":67292,"product_type":"semi-finished","quantity_available":0,"qty_available":1190,"quantity_done":310,"id":86156,"over_picking_qty":0}]
             * state : already_picking
             * process_id : {"process_id":8,"name":"全检","is_rework":false}
             * bom_name : [QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2
             * feedback_on_rework : {"feedback_id":false,"name":null}
             * product_qty : 1500.0
             * in_charge_name : 陈小娟
             * date_planned_start : 2017-05-23 14:29:51
             * product_name : [QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2
             * is_pending : false
             * prepare_material_img : http://192.168.2.36:8069/linkloving_app_api/get_worker_image?worker_id=47726&model=mrp.production&field=prepare_material_img
             */

            private String origin;
            private String remark;
            private PrepareMaterialAreaIdBean prepare_material_area_id;
            private String display_name;
            private ProductIdBean product_id;
            private String production_order_type;
            private int order_id;
            private String sale_remark;
            private double qty_produced;
            private Object cur_location;
            private String state;
            private ProcessIdBean process_id;
            private String bom_name;
            private FeedbackOnReworkBean feedback_on_rework;
            private double product_qty;
            private String in_charge_name;
            private String date_planned_start;
            private String product_name;
            private boolean is_pending;
            private String prepare_material_img;
            private List<StockMoveLinesBean> stock_move_lines;

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public PrepareMaterialAreaIdBean getPrepare_material_area_id() {
                return prepare_material_area_id;
            }

            public void setPrepare_material_area_id(PrepareMaterialAreaIdBean prepare_material_area_id) {
                this.prepare_material_area_id = prepare_material_area_id;
            }

            public String getDisplay_name() {
                return display_name;
            }

            public void setDisplay_name(String display_name) {
                this.display_name = display_name;
            }

            public ProductIdBean getProduct_id() {
                return product_id;
            }

            public void setProduct_id(ProductIdBean product_id) {
                this.product_id = product_id;
            }

            public String getProduction_order_type() {
                return production_order_type;
            }

            public void setProduction_order_type(String production_order_type) {
                this.production_order_type = production_order_type;
            }

            public int getOrder_id() {
                return order_id;
            }

            public void setOrder_id(int order_id) {
                this.order_id = order_id;
            }

            public String getSale_remark() {
                return sale_remark;
            }

            public void setSale_remark(String sale_remark) {
                this.sale_remark = sale_remark;
            }

            public double getQty_produced() {
                return qty_produced;
            }

            public void setQty_produced(double qty_produced) {
                this.qty_produced = qty_produced;
            }

            public Object getCur_location() {
                return cur_location;
            }

            public void setCur_location(Object cur_location) {
                this.cur_location = cur_location;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public ProcessIdBean getProcess_id() {
                return process_id;
            }

            public void setProcess_id(ProcessIdBean process_id) {
                this.process_id = process_id;
            }

            public String getBom_name() {
                return bom_name;
            }

            public void setBom_name(String bom_name) {
                this.bom_name = bom_name;
            }

            public FeedbackOnReworkBean getFeedback_on_rework() {
                return feedback_on_rework;
            }

            public void setFeedback_on_rework(FeedbackOnReworkBean feedback_on_rework) {
                this.feedback_on_rework = feedback_on_rework;
            }

            public double getProduct_qty() {
                return product_qty;
            }

            public void setProduct_qty(double product_qty) {
                this.product_qty = product_qty;
            }

            public String getIn_charge_name() {
                return in_charge_name;
            }

            public void setIn_charge_name(String in_charge_name) {
                this.in_charge_name = in_charge_name;
            }

            public String getDate_planned_start() {
                return date_planned_start;
            }

            public void setDate_planned_start(String date_planned_start) {
                this.date_planned_start = date_planned_start;
            }

            public String getProduct_name() {
                return product_name;
            }

            public void setProduct_name(String product_name) {
                this.product_name = product_name;
            }

            public boolean isIs_pending() {
                return is_pending;
            }

            public void setIs_pending(boolean is_pending) {
                this.is_pending = is_pending;
            }

            public String getPrepare_material_img() {
                return prepare_material_img;
            }

            public void setPrepare_material_img(String prepare_material_img) {
                this.prepare_material_img = prepare_material_img;
            }

            public List<StockMoveLinesBean> getStock_move_lines() {
                return stock_move_lines;
            }

            public void setStock_move_lines(List<StockMoveLinesBean> stock_move_lines) {
                this.stock_move_lines = stock_move_lines;
            }

            public static class PrepareMaterialAreaIdBean {
                /**
                 * area_id : false
                 * area_name : false
                 */

                private boolean area_id;
                private boolean area_name;

                public boolean isArea_id() {
                    return area_id;
                }

                public void setArea_id(boolean area_id) {
                    this.area_id = area_id;
                }

                public boolean isArea_name() {
                    return area_name;
                }

                public void setArea_name(boolean area_name) {
                    this.area_name = area_name;
                }
            }

            public static class ProductIdBean {
                /**
                 * product_ll_type : raw material
                 * area_id : {"area_id":false,"area_name":false}
                 * product_id : 69809
                 * product_name : [QJ.0DZ080.001] 全检制程品-DZ08-木板(火车-引擎)-RT-2-1+2
                 */

                private String product_ll_type;
                private AreaIdBean area_id;
                private int product_id;
                private String product_name;

                public String getProduct_ll_type() {
                    return product_ll_type;
                }

                public void setProduct_ll_type(String product_ll_type) {
                    this.product_ll_type = product_ll_type;
                }

                public AreaIdBean getArea_id() {
                    return area_id;
                }

                public void setArea_id(AreaIdBean area_id) {
                    this.area_id = area_id;
                }

                public int getProduct_id() {
                    return product_id;
                }

                public void setProduct_id(int product_id) {
                    this.product_id = product_id;
                }

                public String getProduct_name() {
                    return product_name;
                }

                public void setProduct_name(String product_name) {
                    this.product_name = product_name;
                }

                public static class AreaIdBean {
                    /**
                     * area_id : false
                     * area_name : false
                     */

                    private boolean area_id;
                    private boolean area_name;

                    public boolean isArea_id() {
                        return area_id;
                    }

                    public void setArea_id(boolean area_id) {
                        this.area_id = area_id;
                    }

                    public boolean isArea_name() {
                        return area_name;
                    }

                    public void setArea_name(boolean area_name) {
                        this.area_name = area_name;
                    }
                }
            }

            public static class ProcessIdBean {
                /**
                 * process_id : 8
                 * name : 全检
                 * is_rework : false
                 */

                private int process_id;
                private String name;
                private boolean is_rework;

                public int getProcess_id() {
                    return process_id;
                }

                public void setProcess_id(int process_id) {
                    this.process_id = process_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public boolean isIs_rework() {
                    return is_rework;
                }

                public void setIs_rework(boolean is_rework) {
                    this.is_rework = is_rework;
                }
            }

            public static class FeedbackOnReworkBean {
                /**
                 * feedback_id : false
                 * name : null
                 */

                private boolean feedback_id;
                private Object name;

                public boolean isFeedback_id() {
                    return feedback_id;
                }

                public void setFeedback_id(boolean feedback_id) {
                    this.feedback_id = feedback_id;
                }

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }
            }

            public static class StockMoveLinesBean {
                /**
                 * quantity_ready : 0.0
                 * virtual_available : 0.0
                 * product_id : [CY.0DZ080.001] 冲压制程品-DZ08-木板(引擎)-2-1+2
                 * suggest_qty : 1545.0
                 * product_uom_qty : 1500.0
                 * order_id : 47726
                 * return_qty : 0.0
                 * product_tmpl_id : 67292
                 * product_type : semi-finished
                 * quantity_available : 0.0
                 * qty_available : 1190.0
                 * quantity_done : 310.0
                 * id : 86156
                 * over_picking_qty : 0.0
                 */

                private double quantity_ready;
                private double virtual_available;
                private String product_id;
                private double suggest_qty;
                private double product_uom_qty;
                private int order_id;
                private double return_qty;
                private int product_tmpl_id;
                private String product_type;
                private double quantity_available;
                private double qty_available;
                private double quantity_done;
                private int id;
                private double over_picking_qty;

                public double getQuantity_ready() {
                    return quantity_ready;
                }

                public void setQuantity_ready(double quantity_ready) {
                    this.quantity_ready = quantity_ready;
                }

                public double getVirtual_available() {
                    return virtual_available;
                }

                public void setVirtual_available(double virtual_available) {
                    this.virtual_available = virtual_available;
                }

                public String getProduct_id() {
                    return product_id;
                }

                public void setProduct_id(String product_id) {
                    this.product_id = product_id;
                }

                public double getSuggest_qty() {
                    return suggest_qty;
                }

                public void setSuggest_qty(double suggest_qty) {
                    this.suggest_qty = suggest_qty;
                }

                public double getProduct_uom_qty() {
                    return product_uom_qty;
                }

                public void setProduct_uom_qty(double product_uom_qty) {
                    this.product_uom_qty = product_uom_qty;
                }

                public int getOrder_id() {
                    return order_id;
                }

                public void setOrder_id(int order_id) {
                    this.order_id = order_id;
                }

                public double getReturn_qty() {
                    return return_qty;
                }

                public void setReturn_qty(double return_qty) {
                    this.return_qty = return_qty;
                }

                public int getProduct_tmpl_id() {
                    return product_tmpl_id;
                }

                public void setProduct_tmpl_id(int product_tmpl_id) {
                    this.product_tmpl_id = product_tmpl_id;
                }

                public String getProduct_type() {
                    return product_type;
                }

                public void setProduct_type(String product_type) {
                    this.product_type = product_type;
                }

                public double getQuantity_available() {
                    return quantity_available;
                }

                public void setQuantity_available(double quantity_available) {
                    this.quantity_available = quantity_available;
                }

                public double getQty_available() {
                    return qty_available;
                }

                public void setQty_available(double qty_available) {
                    this.qty_available = qty_available;
                }

                public double getQuantity_done() {
                    return quantity_done;
                }

                public void setQuantity_done(double quantity_done) {
                    this.quantity_done = quantity_done;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public double getOver_picking_qty() {
                    return over_picking_qty;
                }

                public void setOver_picking_qty(double over_picking_qty) {
                    this.over_picking_qty = over_picking_qty;
                }
            }
        }
    }
}
