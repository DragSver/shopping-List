window.onload = function() {
   $(".checked").click((e) => {
      var btn = $(e.currentTarget);
      var id = btn.attr("id");
      $.post("/checked=" + id);
      location.reload();
   });

   $(".delete").click((e) => {
       var btn = $(e.currentTarget);
       var id = btn.attr("id");
       $.post("/delete=" + id);
       location.reload();
   });
}
