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
public class DataTMP {
    private static List<Rule> listRules = new ArrayList<>();
    private String advice = "";

    public DataTMP(){
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
        DataTMP.listRules = listRules;
    }
    
    public void contructData() {
        
        //DINH DUONG
        Condition q1a = new SimpleCondition("q1a", ""); //sutcanbatthuong
        Condition q1b = new SimpleCondition("q1b", ""); //camthaychanan
        
        Condition q1_score_1 = new RangeCondition<Integer>("q1-score", 0, 8); //0-7
        Condition q1_score_2 = new RangeCondition<Integer>("q1-score", 8, 12);//8-11
        Condition q1_score_3 = new RangeCondition<Integer>("q1-score", 12, 15); //12-14
        
        Condition q1_c1 = ConditionGroup.all(OrConditionGroup.any(q1a, q1b), q1_score_1);
        Condition q1_c2 = ConditionGroup.all(OrConditionGroup.any(q1a, q1b), q1_score_2);
        Condition q1_c3 = ConditionGroup.all(OrConditionGroup.any(q1a, q1b), q1_score_3);
        
        Action suy_dinh_duong = f -> advice += 
                "<h4>Kết luận: Suy dinh dưỡng</h4>" +
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Cần đi khám bệnh để được chăm sóc chuyên khoa<br>" +
                "- Ăn uống lành mạnh, nhiều rau củ, hạn chế chất béo, đường, muối, đồ uống có cồn<br>" +
                "- Chia bữa ăn thành nhiều bữa nhỏ và tạo không khí vui vẻ thoải mái khi ăn<br>" +
                "- Tập thể dục, thể thao vừa sức<br>" +
                "- Sinh hoạt điều độ ăn ngủ đúng giờ<br>" +
                "- Ăn cùng với gia đình<br>" +
                "- Bổ sung dinh dưỡng đường uống<br>" +
                "- Theo dõi cân nặng<br>";
        Action nguy_co_suy_dinh_duong = f -> advice += 
                "<h4>Kết luận: Nguy cơ suy dinh dưỡng</h4>" +
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Ăn uống lành mạnh, nhiều rau củ, hạn chế chất béo, đường, muối, đồ uống có cồn<br>" +
                "- Chia bữa ăn thành nhiều bữa nhỏ và tạo không khí vui vẻ thoải mái khi ăn<br>" +
                "- Tập thể dục, thể thao vừa sức<br>" +
                "- Sinh hoạt điều độ ăn ngủ đúng giờ<br>" +
                "- Ăn cùng với gia đình<br>" +
                "- Cân nhắc bổ sung dinh dưỡng đường uống nếu không thể cải thiện lượng thức ăn đưa vào cơ thể<br>" +
                "- Theo dõi cân nặng<br>";
        Action dinh_duong_binh_thuong = f -> advice +=
                "<h4>Kết luận: Dinh dưỡng bình thường</h4>" +
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Ăn uống lành mạnh, nhiều rau củ, hạn chế chất béo, đường, muối, đồ uống có cồn<br>" +
                "- Chia bữa ăn thành nhiều bữa nhỏ và tạo không khí vui vẻ thoải mái khi ăn<br>" +
                "- Tập thể dục, thể thao vừa sức<br>" +
                "- Sinh hoạt điều độ ăn ngủ đúng giờ<br>" +
                "- Ăn cùng với gia đình<br>";
        
        Rule r1 = new BaseRule("Suy dinh dưỡng", 1, false, q1_c1, suy_dinh_duong);
        Rule r2 = new BaseRule("Nguy cơ suy dinh dưỡng", 1, false, q1_c2, nguy_co_suy_dinh_duong);
        Rule r3 = new BaseRule("Dinh dưỡng bình thường", 1, false, q1_c3, dinh_duong_binh_thuong);

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
        
        Condition q2_c1 = ConditionGroup.all(OrConditionGroup.any(q2a, q2b) , q2_score_1);
        Condition q2_c2 = ConditionGroup.all(OrConditionGroup.any(q2a, q2b) , q2_score_2);
        
        Condition q2_c3 = ConditionGroup.all(q2_c2, q2_3a);
        Condition q2_c4 = ConditionGroup.all(q2_c2, q2_3b);
        Condition q2_c5 = ConditionGroup.all(q2_c2, OrConditionGroup.any(q2_3c, q2_3d));
        Condition q2_c6 = ConditionGroup.all(q2_c2, q2_3e);
        
        Action khong_bi_suy_giam_nhan_thuc = f -> advice +=
                "<h4>Kết luận: Không bị suy giảm nhận thức</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Hoạt động trí não: đọc sách báo, tham gia sinh hoạt cộng đồng <br>" +
                "- Tập thể dục đều đặn, nhẹ nhàng <br>" +
                "- Giữ tinh thần lạc quan, vui vẻ <br>" +
                "- Không sử dụng rượu bia, thuốc lá <br>" +
                "- Kiểm tra sức khỏe định kì và khám bệnh sớm khi có triệu chứng <br>" +
                "- Ăn uống lành mạnh, hạn chế ăn mặn, đường và cholesterol, ăn nhiều rau quả <br>";        
        Action bi_suy_giam_nhan_thuc = f -> advice +=
                "<h4>Kết luận: Bị suy giảm nhận thức</h4>" +
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Cần đi khám tại bệnh viện chuyên khoa<br>" +
                "- Hoạt động trí não: đọc sách báo, tham gia sinh hoạt cộng đồng<br>" +
                "- Tập thể dục đều đặn, nhẹ nhàng<br>" +
                "- Giữ tinh thần lạc quan, vui vẻ<br>" +
                "- Không sử dụng rượu bia, thuốc lá<br>" +
                "- Kiểm tra sức khỏe định kì và khám bệnh sớm khi có triệu chứng<br>" +
                "- Ăn uống lành mạnh, hạn chế ăn mặn, đường và cholesterol, ăn nhiều rau quả<br>";
        Action loai_bo_thuoc = f -> advice +=
                "- Xem xét lại thuốc và loại bỏ một số loại thuốc nếu có thể<br>";
        Action kiem_soat_benh_tim_mach_noi_tiet = f -> advice +=
                "- Cần kiểm soát và điều trị tốt bệnh tim mạch, nội tiết: <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Đo huyết áp hàng ngày <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Kiểm soát đường máu, lượng mỡ trong máu <br>";
        Action phong_tranh_nguy_co_dot_quy_tai_bien = f -> advice +=
                "- Cần phòng tránh nguy cơ tái phát đột quỵ, tai biến <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Ăn uống lành mạnh, hạn chế ăn mặn, đường và cholesterol, ăn nhiều rau quả <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Ngủ đúng giờ đủ giấc <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Không tắm lạnh, tắm khuya vào buổi tối <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Không sử dụng rượu bia, thuốc lá <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Uống thuốc đúng giờ đúng đơn <br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Kiểm tra sức khỏe định kì và khám bệnh sớm khi có triệu chứng <br>";
        Action tu_van_them_suy_dinh_duong = f -> advice +=
                "- Suy dinh dưỡng cũng là một trong những nguyên nhân gây suy giảm nhận thức:<br>"+
                "&nbsp&nbsp&nbsp&nbsp+ Cần đi khám bệnh để được chăm sóc chuyên khoa <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Ăn uống lành mạnh, nhiều rau củ, hạn chế chất béo, đường, muối, đồ uống có cồn <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Chia bữa ăn thành nhiều bữa nhỏ và tạo không khí vui vẻ thoải mái khi ăn <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Tập thể dục, thể thao vừa sức <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Sinh hoạt điều độ ăn ngủ đúng giờ <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Ăn cùng với gia đình <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Bổ sung dinh dưỡng đường uống <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Theo dõi cân nặng <br>";
        
        Rule r4 = new BaseRule("Không bị suy giảm nhận thức",1,false,q2_c1, khong_bi_suy_giam_nhan_thuc);
        Rule r5 = new BaseRule("Bị suy giảm nhận thức",1,false,q2_c2, bi_suy_giam_nhan_thuc);
        Rule r6 = new BaseRule("Loại bỏ thuốc", 1, false, q2_c3, loai_bo_thuoc);
        Rule r7 = new BaseRule("Phòng tránh đột quỵ, tai biến", 1, false, q2_c4, phong_tranh_nguy_co_dot_quy_tai_bien);
        Rule r8 = new BaseRule("Kiểm soát bệnh tim mạch nội tiết", 1, false, q2_c5, kiem_soat_benh_tim_mach_noi_tiet);
        Rule r9 = new BaseRule("Tư vấn thêm về dinh dưỡng", 1, false, q2_c6, tu_van_them_suy_dinh_duong);

        //ROI LOAN TAM THAN
        Condition q3a = new SimpleCondition("q3a", ""); //Cảm thấy thay đổi hành vi, khó tập trung
        
        Condition q3_score_1a = new RangeCondition<Integer>("q3-score-1", 0, 3); //0-2
        Condition q3_score_1b = new RangeCondition<Integer>("q3-score-1", 3, 8); //3-7
        Condition q3_score_2a = new RangeCondition<Integer>("q3-score-2", 0, 1); //0
        Condition q3_score_2b = new RangeCondition<Integer>("q3-score-2", 1, 7); //1-6
        
        Condition q3_c1 = ConditionGroup.any(q3_score_1a, ConditionGroup.all(q3_score_1b, q3_score_2a));
        Condition q3_c2 = ConditionGroup.all(q3_score_1b, q3_score_2b);
        
        Action loi_khuyen_rltt = f -> advice += 
                "<h4>Kết luận: Bình thường</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Hạn chế và loại trừ sang chấn tâm lý, tạo môi trường lành mạnh	<br>" +
                "- Tránh mâu thuẫn trong gia đình, công việc, bạn bè,...	<br>" +
                "- Tránh căng thẳng kéo dài, xây dựng tình đoàn kết giúp đỡ nhau	<br>" +
                "- An ủi, động viên với những người đang đau khổ, có nỗi buồn hoặc thất vọng <br>" +
                "- Tập luyện thể dục thể thao phù hợp với cơ thể <br>" +
                "- Không sử dụng các chất kích thích như thuốc lá, rượu bia,...<br>";
        
        Action bi_rltt = f -> advice +=
                "<h4>Kết luận: Bị rối loạn tâm thần</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" +
                "- Sử dụng thuốc chống loạn thần theo chỉ định của bác sĩ<br>" +
                "- Đến bệnh viện để được bác sĩ điều trị tâm lý<br>";
        
        Rule r10_11 = new BaseRule("Không bị rltt", 1, false, q3_c1, loi_khuyen_rltt);
        Rule r12 = new BaseRule("Bị rltt", 1, false, q3_c2, bi_rltt);
        
        //VAN DONG
        Condition q4a = new SimpleCondition("q4a", "");
        Condition q4b = new SimpleCondition("q4b", "");
        
        Condition q4_1a = new SimpleCondition("q4-1a", ""); //có
        Condition q4_1b = new SimpleCondition("q4-1b", ""); //không
        
        Condition q4_2a = new RangeCondition<Integer>("q4-2", 0, 10);
        Condition q4_2b = new RangeCondition<Integer>("q4-2", 10, 12);
        
        Condition q4_3a = new SimpleCondition("q4-3a", ""); //Dùng nhiều thuốc đồng thời
        Condition q4_3b = new SimpleCondition("q4-3b", ""); //Viêm khớp, loãng xương và các bệnh xương khớp khác.
        Condition q4_3c = new SimpleCondition("q4-3c", ""); //Đuối sức, teo cơ
        Condition q4_3d = new SimpleCondition("q4-3d", ""); //Đau
        
        Condition q4_c1 = ConditionGroup.all(ConditionGroup.any(q4a, q4b), q4_1a);
        Condition q4_c2 = ConditionGroup.all(q4_c1, q4_2b);
        Condition q4_c3 = ConditionGroup.all(q4_c1, q4_2a);
        Condition q4_c4 = ConditionGroup.all(q4_c3, q4_3a);
        Condition q4_c5 = ConditionGroup.all(q4_c3, ConditionGroup.any(q4_3b, q4_3c));
        Condition q4_c6 = ConditionGroup.all(q4_c3, q4_3d);

        Action loi_khuyen_vd = f -> advice += 
                "<h4>Lời khuyên về sức khỏe, lối sống giúp cải thiện, duy trì khả năng vận động</h4>" +
                "- Hạn chế các hoạt động mạnh<br>" +
                "- Tập luyện các bài tập phù hợp với cơ thể hiện tại, tránh tập cố gây mệt mỏi<br>" +
                "- Hạn chế thức khuya, sử dụng các chất kích thích<br>"+        
                "- Bổ sung dinh dưỡng như sữa, các sản phẩm chế biến từ sữa hay các thực phẩm chức năng, để cung cấp thêm dinh dưỡng, vitamin và khoáng chất cần thiết cho cơ thể.<br>" +
                "- Sinh hoạt điều độ, ăn, ngủ đúng giờ, vận động tập luyện phù hợp<br>" +
                "- Người thân cần xử lí môi trường vật lí để giảm nguy cơ té ngã<br>";
        Action vd_binh_thuong = f -> advice += 
                "<h4>Kết luận: Năng lực vận động bình thường</h4>" + 
                "<h4>Giải pháp:</h4>" + 
                "- Thực hiện các bài tập đa phương thức tại nhà<br>" +
                "- Hỗ trợ việc tự quản lí nhằm việc duy trì tập luyện<br>";
        Action vd_han_che = f -> advice +=
                "<h4>Kết luận: Năng lực vận động hạn chế</h4>" + 
                "<h4>Giải pháp:</h4>" +
                "- Thực hiện bài tập đa phương thức và giám sát chặt chẽ<br>" +
                "- Xem xét chuyển sang phục hồi chức năng <br>" +
                "- Cân nhắc bổ sung protein cho cơ thể <br>" +
                "- Xem xét và cung cấp thiết bị hỗ trợ vận động như : Gậy, nạng, xe đẩy, xe lăn và các bộ  phận giả trên cơ thể.<br>";
        Action vd_dung_nhieu_thuoc = f -> advice += 
                "- Xem xét hạn chế dùng nhiều thuốc đồng thời (thuốc chống co giật, benzodiazepin, gây mê, chống trầm cảm, an thần)<br>"+ 
                "&nbsp&nbsp&nbsp&nbsp+ Xem lại các loại thuốc và giảm số lượng. <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Loại bỏ các loại thuốc không cần thiết, không hiệu quả và các loại thuốc cùng công dụng với nhau <br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Để biết nên dừng loại thuốc nào hay không thì ông/bà nên hỏi ý kiến của chuyên gia <br>";
        Action vd_benh_xuong_khop = f -> advice += 
                "- Bị bệnh liên quan đến xương khớp, đuối sức, teo cơ<br>"
                + "&nbsp&nbsp&nbsp&nbsp+ Quản lý tích hợp các bệnh đó bằng cách sử dụng thuốc, cộng với việc vận động vừa phải<br>";
        Action vd_dau = f -> advice += 
                "- Kiểm soát đau:" +
                "&nbsp&nbsp&nbsp&nbsp+ Hiếm khi có thể xác định cụ thể nguyên nhân sinh học của tình trạng đau.<br>" +
                "&nbsp&nbsp&nbsp&nbsp&nbsp=> Vì vậy, cách tốt nhất để quản lý đau là quản lý các yếu tố thể chất liên quan , sự thoải mái về tâm lý, tình trạng dinh dưỡng và giấc ngủ.<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Nếu đau là rào cản lớn trong hoạt động và vận động, ông/bà nên chuyên gia để được tư vấn<br>";
        Rule r13 = new BaseRule("Lời khuyên vận động", 1, false, q4_c1, loi_khuyen_vd);
        Rule r14 = new BaseRule("Lời khuyên vận động", 1, false, q4_c2, vd_binh_thuong);
        Rule r15 = new BaseRule("Lời khuyên vận động", 1, false, q4_c3, vd_han_che);
        Rule r16 = new BaseRule("Lời khuyên vận động", 1, false, q4_c4, vd_dung_nhieu_thuoc);
        Rule r17 = new BaseRule("Lời khuyên vận động", 1, false, q4_c5, vd_benh_xuong_khop);
        Rule r18 = new BaseRule("Lời khuyên vận động", 1, false, q4_c6, vd_dau);
        
        //TRẦM CẢM
        
        Condition q5a = new SimpleCondition("q5a", "");
        Condition q5b = new SimpleCondition("q5b", "");
        
        Condition q5_score_1 = new RangeCondition<Integer>("q5-score", 0, 3);
        Condition q5_score_2 = new RangeCondition<Integer>("q5-score", 3, 9);
        
        Condition q5_2a = new SimpleCondition("q5-2a", "");
        Condition q5_2b = new SimpleCondition("q5-2b", "");
        Condition q5_2c = new SimpleCondition("q5-2c", "");
        Condition q5_2d = new SimpleCondition("q5-2d", "");
        Condition q5_2e = new SimpleCondition("q5-2e", "");
        Condition q5_2f = new SimpleCondition("q5-2f", "");
        
        Condition q5_c1 = ConditionGroup.all(ConditionGroup.any(q5a, q5b), q5_score_2);
        Condition q5_c2 = ConditionGroup.all(ConditionGroup.any(q5a, q5b), q5_score_1);
        Condition q5_c3 = ConditionGroup.all(q5_c2, q5_2a);
        Condition q5_c4 = ConditionGroup.all(q5_c2, q5_2b);
        Condition q5_c5 = ConditionGroup.all(q5_c2, q5_2c);
        Condition q5_c6 = ConditionGroup.all(q5_c2, q5_2d);
        Condition q5_c7 = ConditionGroup.all(q5_c2, q5_2e);
        Condition q5_c8 = ConditionGroup.all(q5_c2, q5_2f);
        
        Action tram_cam = f -> advice += 
                "<h4>Kết luận: Trầm cảm</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" + 
                "- Cần được đưa đến bệnh viện chuyên khoa và chữa trị kịp thời<br>";
        Action trieu_chung_tram_cam = f -> advice += 
                "<h4>Kết luận: Triệu chứng trầm cảm</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" + 
                "- Tăng cường hoạt động: Thiền định, yoga, đi bộ<br>" +
                "- Cần được tư vấn tâm lý<br>" +
                "- Gạt bỏ mọi áp lực trong cuộc sống<br>";
        Action loai_bo_thuoc_tc = f -> advice += "- Cần loại bỏ các thuốc không cần thiết<br>";
        Action tu_van_dinh_duong = f -> advice += "- Tư vấn về dinh dưỡng<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Lựa chọn các thực phẩm giàu chất chống oxy hóa<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Sử dụng carbohydrate đúng cách<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Bổ sung thực phẩm giàu protein, vitamin B, vitamin D, thực phẩm giàu selenium, thực phẩm chứa acid béo omega-3<br>";
        Action dgql_benh_suy_giap = f -> advice += 
                "- Cần đánh giá và quản lý bệnh suy giáp<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Có chế độ dinh dưỡng bổ sung nhiều I-ốt<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Thư gian, suy nghĩ tích cực<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Hoạt động thể chất nhẹ nhàng<br>";
        Action dgql_tinh_trang_dau = f -> advice += 
                "- Cần đánh giá kiểm soát tình trạng đau<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Sử dụng thuốc chống trầm cảm theo chỉ định<br>" +
                "&nbsp&nbsp&nbsp&nbsp+ Hoạt động thể chất phù hợp<br>";
        Action chu_y_cham_soc = f -> advice += 
                "- Cần được chú ý quan tâm chăm sóc nhiều hơn<br>"+
                "- Đến bác sĩ chuyên khoa để được tư vấn cụ thể hơn về các trường hợp suy giảm trên<br>";
        Action chia_se_noi_buon = f -> advice += 
                "- Có thể tìm đến bác sĩ tâm lí hoặc người thân để giải tỏa những vấn đề hoặc tâm tư mà ông/bà đang gặp phải<br>" +
                "- Người thân cần theo dõi biểu hiện trầm cảm, tránh trường hợp người cần tư vấn suy nghĩ đến việc làm hại bản thân hoặc tự sát<br>" +
                "- Thường xuyên tham gia các hoạt động, phong trào tập thể để tránh suy nghĩ đến những việc tiêu cực<br>";
        
        Rule r19 = new BaseRule("r23", 1, false, q5_c1, tram_cam);
        Rule r20 = new BaseRule("r23", 1, false, q5_c2, trieu_chung_tram_cam);
        Rule r21 = new BaseRule("r23", 1, false, q5_c3, loai_bo_thuoc_tc);
        Rule r22 = new BaseRule("r23", 1, false, q5_c4, tu_van_dinh_duong);
        Rule r23 = new BaseRule("r23", 1, false, q5_c5, dgql_benh_suy_giap);
        Rule r24 = new BaseRule("r23", 1, false, q5_c6, dgql_tinh_trang_dau);
        Rule r25 = new BaseRule("r23", 1, false, q5_c7, chu_y_cham_soc);
        Rule r26 = new BaseRule("r23", 1, false, q5_c8, chia_se_noi_buon);

        
        //THÍNH LỰC
        Condition q6a = new SimpleCondition("q6a", ""); //Cảm thấy nghe không rõ
        Condition q6_1a = new SimpleCondition("q6-1a", ""); //Ktra nghe 3 từ đạt cả 2 tai
        Condition q6_1b = new SimpleCondition("q6-1b", ""); //Ktra nghe k đạt
        //Ktra thêm bằng thính lực kế
        Condition q6_2a = new SimpleCondition("q6-2a", ""); //35 db
        Condition q6_2b = new SimpleCondition("q6-2b", ""); //35-80 db
        Condition q6_2c = new SimpleCondition("q6-2c", ""); //>80 db
        
        Condition q6_3a = new SimpleCondition("q6-3a", ""); 
        Condition q6_3b = new SimpleCondition("q6-3b", ""); 
        Condition q6_3c = new SimpleCondition("q6-3c", ""); 
        Condition q6_3d = new SimpleCondition("q6-3d", "");
        Condition q6_3e = new SimpleCondition("q6-3e", "");
        Condition q6_3f = new SimpleCondition("q6-3f", "");
        
        Condition q6_c1 = ConditionGroup.any(ConditionGroup.all(q6a, q6_1a), ConditionGroup.all(q6a, q6_1b, q6_2a)); //Binh thuong
        Condition q6_c2 = ConditionGroup.all(q6a, q6_1b, q6_2b);//Suy giam trung binh nặng
        Condition q6_c3 = ConditionGroup.all(q6a, q6_1b, q6_2c);//Điếc
        
        Condition c6_c4 = ConditionGroup.all(
                ConditionGroup.any(q6_c2, q6_c3), 
                ConditionGroup.any(q6_3a, q6_3b, q6_3c, q6_3d, q6_3e, q6_3f));
        
        Action thinh_luc_binh_thuong = f -> advice += 
                "<h4>Kết luận: Thính lực bình thường</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" + 
                "- Ăn uống đủ dưỡng chất, ưu tiên các nhóm thực phẩm giàu sắt, kẽm, vitamin D.<br>" +
                "- Hạn chế rượu bia, thuốc lá; tránh chấn thương ở vùng đầu, tai.<br>" +
                "- Không dùng chung dụng cụ lấy ráy tai hoặc đưa vật lạ vào tai.<br>" +
                "- Tránh stress, cần có chế độ nghỉ ngơi hợp lý.<br>" +
                "- Tránh nơi có tiếng ồn lớn.<br>" +
                "- Tránh dùng những thuốc có nguy cơ độc với thính giác.<br>";
        Action thinh_luc_suy_giam_tb_nang = f -> advice +=
                "<h4>Kết luận: Suy giảm thính lực mức trung bình nặng</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" + 
                "- Sử dụng máy trợ thính<br>" +
                "- Hoặc học đọc qua nhìn môi, qua ký hiệu và các cách giao tiếp khác<br>" +
                "- Nên đi khám tai mỗi năm 1 lần<br>" +
                "- Thường xuyên tương tác xã hội<br>";
        Action thinh_luc_diec = f -> advice += 
                "<h4>Kết luận: Điếc</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" + 
                "- Cần đến bệnh viện chuyên khoa tai để được thăm khám và chữa trị<br>";
        Action thinh_luc_nguy_hiem = f -> advice += 
                "<h4>Đánh giá tình trạng: Nguy hiểm</h4>" + 
                "<h4>Giải pháp, lời khuyên:</h4>" + 
                "- Cần đến bệnh viện chuyên khoa tai để được thăm khám và chữa trị các vấn đề ảnh hưởng đến thính lực<br>";
        
        Rule r27 = new BaseRule("r27", 1, false, q6_c1, thinh_luc_binh_thuong);
        Rule r28 = new BaseRule("r28", 1, false, q6_c2, thinh_luc_suy_giam_tb_nang);
        Rule r29 = new BaseRule("r29", 1, false, q6_c3, thinh_luc_diec);
        Rule r30 = new BaseRule("r30", 1, false, c6_c4, thinh_luc_nguy_hiem);
       
        listRules.add(r1);
        listRules.add(r2);
        listRules.add(r3);
        listRules.add(r4);
        listRules.add(r5);
        listRules.add(r6);
        listRules.add(r7);
        listRules.add(r8);
        listRules.add(r9); //Nho phai them luat
        listRules.add(r10_11);
        listRules.add(r12);
        listRules.add(r13);
        listRules.add(r14);
        listRules.add(r15);
        listRules.add(r16);
        listRules.add(r17);
        listRules.add(r18);
        listRules.add(r19);
        listRules.add(r20);
        listRules.add(r21);
        listRules.add(r22);
        listRules.add(r23);
        listRules.add(r24);
        listRules.add(r25);
        listRules.add(r26);
        listRules.add(r27);
        listRules.add(r28);
        listRules.add(r29);
        listRules.add(r30);


    }
    
    public String run(Fact fact){
        contructData();
        RuleEngine engine = new RuleEngine();
        engine.runRules(listRules, fact);
        return advice;
    }
}
