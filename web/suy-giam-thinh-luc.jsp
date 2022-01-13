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
        <script src="/HTTT/script.js"></script>
        <title>Suy giảm thính lực</title>
    </head>
    <body>
      
            <form method="POST" action="suy-giam-thinh-luc">
                <h3>Kiểm tra nghe giọng nói thầm cả 2 tai bằng cách nói thầm 3 từ và yêu cầu nhắc lại</h3>
                <input type="hidden" id="form" name="form" value="1" hidden>
                <input type="hidden" id="q6" name="q6" value="q6a" hidden>
                <div class="form-check">
                    <input type="radio" class="form-check-input q61" id="q6-1a" name="q6-1" value="q6-1a" checked><label for="q6-1a" class="form-check-label">Đạt (đủ 3 từ mỗi tai)</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input q61" id="q6-1b" name="q6-1" value="q6-1b"><label for="q6-1b" class="form-check-label">Không đạt</label>
                </div>

                
                <div id="q62">
                    <h3>Kiếm tra thêm bằng thính lực kế</h3>                
                    <div class="form-check">
                        <input type="radio" class="form-check-input" id="q6-2a" name="q6-2" value="q6-2a"><label for="q6-2a" class="form-check-label"><= 35 db</label>
                    </div>
                    <div class="form-check">
                        <input type="radio" class="form-check-input" id="q6-2b" name="q6-2" value="q6-2b"><label for="q6-2b" class="form-check-label">35-80db</label>
                    </div>
                    <div class="form-check">    
                        <input type="radio" class="form-check-input" id="q6-2c" name="q6-2" value="q6-2c" checked><label for="q6-2c" class="form-check-label">>80db</label>
                    </div>
                </div>
                
                <h3>Thông tin thêm</h3>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q6-3a" name="q6-3" value="q6-3a"><label for="q6-3a" class="form-check-label">- Dùng thuốc gây hại cho tai như streptomycin, gentamicin, quinine, chloroquine</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="q6-3b" name="q6-3" value="q6-3b"><label for="q6-3b" class="form-check-label">- Đau tai</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q6-3c" name="q6-3" value="q6-3c"><label for="q6-3c" class="form-check-label">- Chóng mặt</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q6-3d" name="q6-3" value="q6-3d"><label for="q6-3d" class="form-check-label">- Viêm tai giữa mãn tính</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q6-3e" name="q6-3" value="q6-3e"><label for="q6-3e" class="form-check-label">- Mất thính giác 1 bên</label>
                </div>
                <div class="form-check">    
                    <input type="checkbox" class="form-check-input" id="q6-3f" name="q6-3" value="q6-3f"><label for="q6-3f" class="form-check-label">- Tiền sử chảy mủ tai, mất thính lực đột ngột hoặc nhanh chóng</label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        <script>
            $(document).ready(function () {
                $('#q62').hide();
                $('#q6-1b').click(function () {
                    if ($(this).is(':checked')) {
                        $('#q62').show();
                    } else{
                        $('#q62').hide();
                    }
                });

                $('#q6-1a').click(function () {
                    if ($(this).is(':checked')) {
                        $('#q62').hide();
                    } else{
                        $('#q62').show();
                    }
                });
            });
            
 
            

            
        </script>
    
    </body>
            

</html>
