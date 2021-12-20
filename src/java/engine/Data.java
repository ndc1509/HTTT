package engine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import common.*;
import condition.*;
import engine.*;
import fact.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Cuong
 */
public class Data {
    private static List<Rule> listRules = new ArrayList<>();
    private String advice = "";

    public Data(){
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public static List<Rule> getListRules() {
        return listRules;
    }

    public static void setListRules(List<Rule> listRules) {
        Data.listRules = listRules;
    }
    
    public void contructData() {
        
        //Suy giam nhan thuc
        Condition q2a = new SimpleCondition("q2a", ""); //hayquen
        Condition q2b = new SimpleCondition("q2b", ""); //khoxacdinhkhongthoigian
          
        Condition q2_score_1 = new RangeCondition<Integer>("q2-score", 4, 6);
        Condition q2_score_2 = new RangeCondition<Integer>("q2-score", 0, 4);
        
        Condition q2_3a = new SimpleCondition("q2-3a", ""); //Sử dụng nhiều thuốc đồng thời
        Condition q2_3b = new SimpleCondition("q2-3b", ""); //Tiền sử bệnh mạch máu não (đột quỵ/tai biến/thiếu máu não...)
        Condition q2_3c = new SimpleCondition("q2-3c", ""); //Tiền sử bệnh tim mạch (tăng huyết áp/nhồi máu cơ tim..)
        Condition q2_3d = new SimpleCondition("q2-3d", ""); //Tiền sử bệnh nội tiết (đái tháo đường/suy giáp...)
        Condition q2_3e = new SimpleCondition("q2-3e", ""); //Suy dinh dưỡng
        
        Condition c1 = ConditionGroup.all(OrConditionGroup.any(q2a, q2b) , q2_score_1);
        Condition c2 = ConditionGroup.all(OrConditionGroup.any(q2a, q2b) , q2_score_2);
        
        Condition c3 = ConditionGroup.all(c2, q2_3a);
        Condition c4 = ConditionGroup.all(c2, q2_3b);
        Condition c5 = ConditionGroup.all(c2, OrConditionGroup.any(q2_3c, q2_3d));
        Condition c6 = ConditionGroup.all(c2, q2_3e);
        
        Action khong_bi_suy_giam_nhan_thuc = f -> advice +=
                "Không bị suy giảm nhận thức. Cách sinh hoạt phòng tránh suy giảm nhận thức <br>" +
                "- Hoạt động trí não: đọc sách báo, tham gia sinh hoạt cộng đồng <br>" +
                "- Tập thể dục đều đặn, nhẹ nhàng <br>" +
                "- Giữ tinh thần lạc quan, vui vẻ <br>" +
                "- Không sử dụng rượu bia, thuốc lá <br>" +
                "- Kiểm tra sức khỏe định kì và khám bệnh sớm khi có triệu chứng <br>" +
                "- Ăn uống lành mạnh, hạn chế ăn mặn, đường và cholesterol, ăn nhiều rau quả <br>";        
        Action bi_suy_giam_nhan_thuc = f -> advice +=
                "Bị suy giảm nhận thức, cần đi khám tại bệnh viện chuyên khoa <br>";
        Action loai_bo_thuoc = f -> advice +=
                "Xem xét lại thuốc và loại bỏ nếu có thể <br>";
        Action kiem_soat_benh_tim_mach_noi_tiet = f -> advice +=
                "Cần kiểm soát và điều trị tốt bệnh tim mạch, nội tiết: <br>"
                + "- Đo huyết áp hàng ngày <br>"
                + "- Kiểm soát đường máu, lượng mỡ trong máu <br>";
        Action phong_tranh_nguy_co_dot_quy_tai_bien = f -> advice +=
                "Cần phòng tránh nguy cơ tái phát đột quỵ, tai biến <br>"
                + "- Ăn uống lành mạnh, hạn chế ăn mặn, đường và cholesterol, ăn nhiều rau quả <br>"
                + "- Ngủ đúng giờ đủ giấc <br>"
                + "- Không tắm lạnh, tắm khuya vào buổi tối <br>"
                + "- Không sử dụng rượu bia, thuốc lá <br>"
                + "- Uống thuốc đúng giờ đúng đơn <br>"
                + "- Kiểm tra sức khỏe định kì và khám bệnh sớm khi có triệu chứng <br>";
        Action tu_van_them_suy_dinh_duong = f -> advice +=
                "- Cần đi khám bệnh để được chăm sóc chuyên khoa <br>" +
                "- Ăn uống lành mạnh, nhiều rau củ, hạn chế chất béo, đường, muối, đồ uống có cồn <br>" +
                "- Chia bữa ăn thành nhiều bữa nhỏ và tạo không khí vui vẻ thoải mái khi ăn <br>" +
                "- Tập thể dục, thể thao vừa sức <br>" +
                "- Sinh hoạt điều độ ăn ngủ đúng giờ <br>" +
                "- Ăn cùng với gia đình <br>" +
                "- Bổ sung dinh dưỡng đường uống <br>" +
                "- Theo dõi cân nặng <br>";
        
        Rule r4 = new BaseRule("Không bị suy giảm nhận thức",1,false,c1, khong_bi_suy_giam_nhan_thuc);
        Rule r5 = new BaseRule("Bị suy giảm nhận thức",1,false,c2, bi_suy_giam_nhan_thuc);
        Rule r6 = new BaseRule("Loại bỏ thuốc", 1, false, c3, loai_bo_thuoc);
        Rule r7 = new BaseRule("Phòng tránh đột quỵ, tai biến", 1, false, c4, phong_tranh_nguy_co_dot_quy_tai_bien);
        Rule r8 = new BaseRule("Kiểm soát bệnh tim mạch nội tiết", 1, false, c5, kiem_soat_benh_tim_mach_noi_tiet);
        Rule r9 = new BaseRule("Tư vấn thêm về dinh dưỡng", 1, false, c6, tu_van_them_suy_dinh_duong);
        
//        RuleEngine engine = new RuleEngine();
//        
//        List<FactPair> facts = new ArrayList<>();
//        facts.add(new FactPair("q2a", "")); //"hay quen" Hoặc "khoxacdinhkhongthoigian"
//        facts.add(new FactPair("q2-score",3));
//        facts.add(new FactPair("q2-3a", ""));
//        facts.add(new FactPair("q2-3b", "")); //Them vao neu muon
//        
//        Fact fact = new DefaultFact(new FactPairs(facts));
        
        
        listRules.add(r4);
        listRules.add(r5);
        listRules.add(r6);
        listRules.add(r7);
        listRules.add(r8);
        listRules.add(r9); //Nho phai them luat
    }
    
    public String run(Fact fact){
        contructData();
        RuleEngine engine = new RuleEngine();
        engine.runRules(listRules, fact);
        return advice;
    }
}
