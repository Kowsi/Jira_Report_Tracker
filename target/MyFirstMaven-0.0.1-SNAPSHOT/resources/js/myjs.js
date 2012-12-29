$.fn.center = function(parent){
    var w = parent? $(window) : this.parent();
    this.css({
        "position": "absolute",
        "top": (((w.height() - this.outerHeight()) / 2) + w.scrollTop() + "px"),
        "left": (((w.width() - this.outerWidth()) / 2) + w.scrollLeft() + "px")
    });
    return this;
};

$(document).ready(function(){
	$("div.target").center(true);
});

$(function() {
	var icons = {
            header: "ui-icon-circle-arrow-e",
            activeHeader: "ui-icon-circle-arrow-s"
    };
    $( "#accordion" ).accordion({
    	collapsible: true,
    	icons:icons,
    	minHeight:300,
    	heightStyle: "content"
    });
    $("table > tr > td a[rel]").overlay({effect: 'apple'});
});