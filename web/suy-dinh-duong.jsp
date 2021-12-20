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
        <title>Suy dinh dưỡng</title>
    </head>
    <body>
        <form method="POST" action="ket-luan-1">
            <h3>Lượng thức ăn có giảm trong 3 tháng qua do chán ăn, các vấn đề về tiêu hóa, khó nhai hoặc nuốt không?</h3>
            <input type="text" id="q1" name="q1a" value="q1a" hidden>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-1a" name="q1-1" value="0" checked><label for="q1-1a" class="form-check-label">Giảm nhiều</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-1b" name="q1-1" value="1"><label for="q1-1b" class="form-check-label">Giảm</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-1c" name="q1-1" value="2"><label for="q1-1c" class="form-check-label">Không</label>
            </div>
            <h3>Sụt cân trong 3 tháng qua</h3>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-2a" name="q1-2" value="0" checked><label for="q1-2a" class="form-check-label">Giảm nhiều hơn 3 kg</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-2b" name="q1-2" value="1"><label for="q1-2b" class="form-check-label">Không rõ</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-2c" name="q1-2" value="2"><label for="q1-2c" class="form-check-label">Giảm từ 1-3 kg</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-2d" name="q1-2" value="3"><label for="q1-2d" class="form-check-label">Không bị</label>
            </div>
            <h3>Khả năng vận động</h3>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-3a" name="q1-3" value="0" checked><label for="q1-3a" class="form-check-label">Nằm liệt giường</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-3b" name="q1-3" value="1"><label for="q1-3b" class="form-check-label">Có thể ra khỏi giường nhưng không ra ngoài</label>
            </div>
            <div class="form-check">    
                <input type="radio" class="form-check-input" id="q1-3c" name="q1-3" value="2"><label for="q1-3c" class="form-check-label">Có ra ngoài</label>
            </div>
            <h3>Có bị căng thẳng tâm lý hoặc mắc bệnh cấp tính trong 3 tháng qua không?</h3>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-4a" name="q1-4" value="0" checked><label for="q1-4a" class="form-check-label">Có</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-4b" name="q1-4" value="2"><label for="q1-4b" class="form-check-label">Không</label>
            </div>
            <h3>Vấn đề tâm thần kinh</h3>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-5a" name="q1-5" value="0" checked><label for="q1-5a" class="form-check-label">Sa sút trí tuệ hoặc trầm cảm</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-5b" name="q1-5" value="1"><label for="q1-5b" class="form-check-label">Mất trí nhớ nhẹ</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-5c" name="q1-5" value="2"><label for="q1-5c" class="form-check-label">Không</label>
            </div>
            <h3>Tính BMI (Mấy ông sửa lại thành hỏi cân nặng chiều cao nhé)</h3>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-6a" name="q1-6" value="0" checked><label for="q1-6a" class="form-check-label"><19</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-6b" name="q1-6" value="1"><label for="q1-6b" class="form-check-label">19<=BMI<21</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-6c" name="q1-6" value="2"><label for="q1-6c" class="form-check-label">21<=BMI<23</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="q1-6d" name="q1-6" value="3"><label for="q1-6d" class="form-check-label">>=23</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </body>
</html>
