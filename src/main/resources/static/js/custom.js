
var url = "fetchProductList";
$.get(url, function(data) {
	var products = eval(data);

	var app4 = new Vue({
		el : '#productList',
		data : {
			products : products
		}
	});

	// Porfolio isotope and filter
	var portfolioIsotope = $('.portfolio-container').isotope({
		itemSelector : '.portfolio-item',
		layoutMode : 'fitRows'
	});

	$('#portfolio-flters li').on('click', function() {
		$("#portfolio-flters li").removeClass('filter-active');
		$(this).addClass('filter-active');

		portfolioIsotope.isotope({
			filter : $(this).data('filter')
		});
	});
	
	$("#first-data").click();
});