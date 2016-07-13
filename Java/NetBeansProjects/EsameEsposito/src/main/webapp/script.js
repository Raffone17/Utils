$(document).ready(function(){
               $('.nav-item').removeClass('active');
               var title = $(document).find("title").text();
               
               $('#'+title).addClass('active');
               
               
 });