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
        <title>Suy giảm khả năng vận động</title>
    </head>
    <body>
      
            <form method="POST" action="suy-giam-van-dong">
                <h3>Bài kiểm tra với ghế: </h3>
                <h3>Có thể hoàn thành bài tập đứng lên ngồi xuống ghế 5 lần không dùng tay trong 14 giây không?</h3>
                <input type="hidden" id="form" name="form" value="1" hidden>
                <input type="hidden" id="q4" name="q4" value="q4a" hidden>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-1a" name="q4-1" value="q4-1a"><label for="q4-1a" class="form-check-label">Có</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-1b" name="q4-1" value="q4-1b"><label for="q4-1b" class="form-check-label">Không</label>
                </div>
                



                <h3>Đánh giá năng lực vận động:</h3>
                <h3>Tính điểm SPPB (thiết kế form riêng), đứng 10 giây theo mỗi ba cách sau:</h3>
                <h3>Đứng 2 bàn chân song song</h3>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-1a" name="q4-2-1" value="1"><label for="q4-2-1a" class="form-check-label">Giữ đc trong 10s 1đ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-1b" name="q4-2-1" value="0"><label for="q4-2-1b" class="form-check-label">Không giữ được trong 10s 0đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-1c" name="q4-2-1" value="0" checked><label for="q4-2-1c" class="form-check-label">Không đứng được 0đ Kết thúc ktra</label>
                </div>
                <h3>Đứng bàn chân sau tiếp xúc nửa bàn chân trước</h3>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-2a" name="q4-2-2" value="1"><label for="q4-2-2a" class="form-check-label">Giữ đc trong 10s 1đ </label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-2b" name="q4-2-2" value="0"><label for="q4-2-2b" class="form-check-label">Không giữ được trong 10s 0đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-2c" name="q4-2-2" value="0" checked><label for="q4-2-2c" class="form-check-label">Không đứng được 0đ Kết thúc ktra</label>
                </div>
                <h3>Đứng bàn chân sau đặt hoàn toàn ra sau bàn chân trước</h3>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-3a" name="q4-2-3" value="2"><label for="q4-2-3a" class="form-check-label">Giữ đc trong 10s 2đ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-3b" name="q4-2-3" value="1"><label for="q4-2-3b" class="form-check-label">Giữ được từ 3-10s 1đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-3c" name="q4-2-3" value="0"><label for="q4-2-3c" class="form-check-label">Giữ được từ <3s 0đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-3d" name="q4-2-3" value="0" checked><label for="q4-2-3d" class="form-check-label">Không đứng được 0đ</label>
                </div>
                
                <h3>Kiểm tra đi bộ 4 mét</h3>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-4a" name="q4-2-4" value="4"><label for="q4-2-4a" class="form-check-label"><4.8s 4đ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-4b" name="q4-2-4" value="3"><label for="q4-2-4b" class="form-check-label">4.8 - 6.2s 3đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-4c" name="q4-2-4" value="2"><label for="q4-2-4c" class="form-check-label">6.2- 8.7s 2đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-4d" name="q4-2-4" value="1"><label for="q4-2-4d" class="form-check-label">>8.7s 1đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-4e" name="q4-2-4" value="0" checked><label for="q4-2-4e" class="form-check-label">Không thể hoàn thành 0đ</label>
                </div>
                
                <h3>Kiểm tra đứng lên khỏi ghế 5 lần</h3>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-5a" name="q4-2-5" value="4"><label for="q4-2-5a" class="form-check-label"><11.2s 4đ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="q4-2-5b" name="q4-2-5" value="3"><label for="q4-2-5b" class="form-check-label">11.2-13.7s 3đ</label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-5c" name="q4-2-5" value="2"><label for="q4-2-5c" class="form-check-label">13.7 - 16.7s 2đ </label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-5d" name="q4-2-5" value="1"><label for="q4-2-5d" class="form-check-label">16.7-60s 1đ </label>
                </div>
                <div class="form-check">    
                    <input type="radio" class="form-check-input" id="q4-2-5e" name="q4-2-5" value="0" checked><label for="q4-2-5e" class="form-check-label">>60s hoặc k thể hoàn thành 0đ</label>
                </div>
                
                <h3>Thông tin thêm</h3>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q4-3a" name="q4-3" value="q4-3a"><label for="q4-3" class="form-check-label">Dùng nhiều thuốc đồng thời</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q4-3b" name="q4-3" value="q4-3a"><label for="q4-3" class="form-check-label">Viêm khớp, loãng xương và các bệnh xương khớp khác.</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q4-3c" name="q4-3" value="q4-3a"><label for="q4-3" class="form-check-label">Đuối sức, teo cơ</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q4-3d" name="q4-3" value="q4-3a"><label for="q4-3" class="form-check-label">Đau</label>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
    </body>
</html>
