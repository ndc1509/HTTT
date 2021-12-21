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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rối loạn tâm thần</title>
    </head>
    <body>
        <c:if test="${ask_more == false}">
            <form method="POST" action="roi-loan-tam-than">
                <h3>Ông bà có các triệu chứng dưới đây không?</h3>
                <input type="hidden" id="form" name="form" value="1" hidden>
                <input type="hidden" id="q3" name="q3" value="q3a" hidden>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-1a" name="q3-1" value="q3-1a"><label for="q3-1a" class="form-check-label">Dễ bị kích động</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-1b" name="q3-1" value="q3-1b"><label for="q3-1b" class="form-check-label">Có hành vi hung hăng</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q3-1c" name="q3-1" value="q3-1c"><label for="q3-1c" class="form-check-label">Nghe thấy giọng nói hoặc nhìn thấy những thứ không tồn tại</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-1d" name="q3-1" value="q3-1d"><label for="q3-1d" class="form-check-label">Chuyển động cơ thể bất thường</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-1e" name="q3-1" value="q3-1e"><label for="q3-1e" class="form-check-label">Lời nói lộn xộn</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-1f" name="q3-1" value="q3-1f"><label for="q3-1f" class="form-check-label">Khó tập trung hoặc hoàn thành nhiệm vụ</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-1g" name="q3-1" value="q3-1g"><label for="q3-1g" class="form-check-label">Giảm biểu hiện cảm xúc</label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </c:if>
        <c:if test="${ask_more == true}">
            <form method="POST" action="roi-loan-tam-than">
                <input type="hidden" id="form" name="form" value="2">
                <input type="hidden" id="q3" name="q3" value="${q3}">
                <input type="hidden" id="q3-score-1" name="q3-score-1" value="${score}">
                <h3>Trong 1 tuần vừa rồi, ông/bà có triệu chứng dưới đây xảy ra đồng thời không?</h3>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-2a" name="q3-2" value="q3-2a"><label for="q3-2a" class="form-check-label">Có dấu hiệu bỏ bê bản thân</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-2b" name="q3-2" value="q3-2b"><label for="q3-2b" class="form-check-label">Hay cười nói một mình</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q3-2c" name="q3-2" value="q3-2c"><label for="q3-2c" class="form-check-label">Năng động, nói nhiều hơn hoặc nói nhanh hơn</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-2d" name="q3-2" value="q3-2d"><label for="q3-2d" class="form-check-label">Hay cáu kỉnh, khó tính</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-2e" name="q3-2" value="q3-2e"><label for="q3-2e" class="form-check-label">Giảm nhu cầu giấc ngủ</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q3-2f" name="q3-2" value="q3-2f"><label for="q3-2f" class="form-check-label">Ảo tưởng, bị ảnh hưởng bởi văn hóa nào đó</label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </c:if>
    </body>
</html>
