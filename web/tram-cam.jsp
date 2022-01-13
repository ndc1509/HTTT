<%-- 
    Document   : suy-giam-nhan-thuc
    Created on : Dec 18, 2021, 4:15:19 PM
    Author     : Cuong
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <link href="style.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="script.js" type="text/javascipt"></script>
        <title>Trầm cảm</title>
    </head>
    <body>
        
            <form method="POST" action="tram-cam">
                <h3>Trong 2 tuần qua, ông bà có bị ?</h3>
                <input type="hidden" id="q5" name="q5" value="q5a" hidden>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1a" name="q5-1" value="q5-1a"><label for="q5-1a" class="form-check-label">Khó ngủ, không ngủ được hoặc ngủ quá nhiều</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1b" name="q5-1" value="q5-1b"><label for="q5-1b" class="form-check-label">Cảm thấy mệt mỏi hoặc uể oải</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1c" name="q5-1" value="q5-1c"><label for="q5-1c" class="form-check-label">Chán ăn hoặc ăn quá nhiều</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1d" name="q5-1" value="q5-1d"><label for="q5-1d" class="form-check-label">Cảm thấy bản thân thật là tồi tệ hoặc là một người thất bại hoặc đã khiến bản thân hoặc gia đình thất vọng</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1e" name="q5-1" value="q5-1e"><label for="q5-1e" class="form-check-label">Khó tập trung khi đọc báo/xem ti vi</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1f" name="q5-1" value="q5-1f"><label for="q5-1f" class="form-check-label">Di chuyển hoặc nói chậm</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1g" name="q5-1" value="q5-1g"><label for="q5-1g" class="form-check-label">Lo lắng hoặc bồn chồn đến mức đi lại nhiều hơn bình thường</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-1h" name="q5-1" value="q5-1h"><label for="q5-1h" class="form-check-label">Nghĩ đến cái chết hoặc việc làm tổn thương mình</label>
                </div>
                
                <h3>Hỏi thêm</h3>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-2a" name="q5-2" value="q5-2a"><label for="q5-2a" class="form-check-label">A Dùng nhiều thuốc đồng thời (thuốc kháng histamine, thuốc chống loạn thần, thuốc giãn cơ)</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-2b" name="q5-2" value="q5-2b"><label for="q5-2b" class="form-check-label">B Suy dinh dưỡng</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-2c" name="q5-2" value="q5-2c"><label for="q5-2c" class="form-check-label">C Suy tuyến giáp</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-2d" name="q5-2" value="q5-2d"><label for="q5-2d" class="form-check-label">D Đau mãn tính</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-2e" name="q5-2" value="q5-2e"><label for="q5-2e" class="form-check-label">E Suy giảm thị lực, thính lực, khả năng vận động, khả năng nhận thức...</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q5-2f" name="q5-2" value="q5-2f"><label for="q5-2f" class="form-check-label">F Có mất mát to lớn (người thân, phá sản,..)</label>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
    </body>
</html>
