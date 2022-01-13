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
        <title>Suy giảm nhận thức</title>
    </head>
    <body>
       
            <form method="POST" action="suy-giam-nhan-thuc">
                <h3>Yêu cầu nhớ 3 từ đơn giản và nhắc lại sau khi vẽ đồng hồ. Nhớ được?</h3>
                
                <input type="hidden" id="q2" name="q2a" value="q2a" hidden>
                <div class="form-check">
                    <input type="radio" class="form-check-input q21" id="q2-1a" name="q2-1" value="3"><label for="q2-1a" class="form-check-label">3 từ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input q21" id="q2-1b" name="q2-1" value="2"><label for="q2-1b" class="form-check-label">2 từ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input q21" id="q2-1c" name="q2-1" value="1"><label for="q2-1c" class="form-check-label">1 từ</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input q21" id="q2-1d" name="q2-1" value="0" checked><label for="q2-1d" class="form-check-label">0 từ</label>
                </div>
                <h3>Yêu cầu vẽ đồng hồ: vẽ đúng mặt đồng hồ với số chỉ giờ VÀ vẽ kim chỉ 11h10</h3>
                <div class="form-check">
                    <input type="radio" class="form-check-input q22" id="q2-2a" name="q2-2" value="2"><label for="q2-2a" class="form-check-label">Vẽ được cả 2</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input q22" id="q2-2b" name="q2-2" value="1"><label for="q2-2b" class="form-check-label">Vẽ được 1 trong 2</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input q22" id="q2-2c" name="q2-2" value="0" checked><label for="q2-2c" class="form-check-label">Không vẽ được</label>
                </div>
               
                <div id="q23">
                    <h3>Thông tin liên quan</h3>
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="q2-3a" name="q2-3" value="q2-3a"><label for="q2-3a" class="form-check-label">Sử dụng nhiều thuốc đồng thời</label>
                    </div>
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="q2-3b" name="q2-3" value="q2-3b"><label for="q2-3b" class="form-check-label">Tiền sử bệnh mạch máu não (đột quỵ/tai biến/thiếu máu não...)</label>
                    </div>
                    <div class="form-check">    
                        <input type="checkbox" class="form-check-input" id="q2-3c" name="q2-3" value="q2-3c"><label for="q2-3c" class="form-check-label">Tiền sử bệnh tim mạch (tăng huyết áp/nhồi máu cơ tim..)</label>
                    </div>
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="q2-3d" name="q2-3" value="q2-3d"><label for="q2-3d" class="form-check-label">Tiền sử bệnh nội tiết (đái tháo đường/suy giáp...)</label>
                    </div>
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="q2-3e" name="q2-3" value="q2-3e"><label for="q2-3e" class="form-check-label">Suy dinh dưỡng</label>
                    </div>
                </div>         
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        <script>
            $(document).ready(function () {
                
                $('input[type=radio]').on('change', function(){
                    var score = getScore();
                    if(score < 4){
                        $('#q23').show();
                    } else{
                        $('#q23').hide();
                    }
                });
           
            });
            
            function getScore(){
                var score_1 = parseInt($('input[name=q2-1]:checked').val());
                var score_2 = parseInt($('input[name=q2-2]:checked').val());
         
                return score_1 + score_2;
            }
        </script>
    </body>
</html>
