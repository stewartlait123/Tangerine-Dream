<script type="text/javascript">

var carouselHolder = document.getElementById("department-holder");
var carouselDisplayCount = carouselHolder.offsetWidth/128;

$(document).ready(function() {
	
	$('.carousel1').slick({

		slidesToShow:6,
		slidesToScroll: 1,
	  	arrows: true,
	  	dots: false,
	  	infinite:true,

	  	responsive: [{

	  		breakpoint: 1500,
      		settings:
      		{
        		slidesToShow: 6,
        		infinite: true
      		}
      	},
	  		{
	  		breakpoint: 1224,
      		settings:
      		{
        		slidesToShow: 4,
        		infinite: true
      		}
      	},
      	{
	  		breakpoint: 800,
      		settings:
      		{
        		slidesToShow: 3,
        		infinite: true
      		}
      	}]
		
	});
	
	$('.carousel2').slick({

		slidesToShow:6,
		slidesToScroll: 1,
	  	arrows: true,
	  	dots: false,
	  	infinite:true,

	  	responsive: [{

	  		breakpoint: 1500,
      		settings:
      		{
        		slidesToShow: 6,
        		infinite: true
      		}
      	},
	  		{
	  		breakpoint: 1224,
      		settings:
      		{
        		slidesToShow: 4,
        		infinite: true
      		}
      	},
      	{
	  		breakpoint: 800,
      		settings:
      		{
        		slidesToShow: 3,
        		infinite: true
      		}
      	}]
		
	});


	responsiveLayout();
  
});

$(window).resize(function(){

	responsiveLayout();

	});


function responsiveLayout() {

	var docWidth = $(window).width();

	if(docWidth > 1224)
	{
		//Return settings to 'default' if page is large enough.

		document.getElementById("content-container").style.textAlign = "center";


		document.getElementById("product-titlewrapper").style.float = "left";

		document.getElementById("news-container").style.width = '350px';
		document.getElementById("news-container").style.float = "right";


		var newsPanelElements = document.getElementsByClassName("news-panel");
		for(var i = 0 ;  i < newsPanelElements.length ; i++){
			newsPanelElements[i].style.padding = "5px";
			newsPanelElements[i].style.width = "350px";
		}

		var newsItemElements = document.getElementsByClassName("news-item");
		for(var i = 0 ; i < newsItemElements ; i++)
		{
			newsItemElements[i].style.width = 330;
		}

	}else if(docWidth > 800)
	{

		document.getElementById("content-container").style.textAlign = "center";

		document.getElementById("product-titlewrapper").style.float = "none";

		document.getElementById("news-container").style.width = "350px";
		document.getElementById("news-container").style.float = "right";


		var newsPanelElements = document.getElementsByClassName("news-panel");
		for(var i = 0 ;  i < newsPanelElements.length ; i++){
			newsPanelElements[i].style.padding = "5px";
			newsPanelElements[i].style.width = "350px";
		}
	}else
	{

		document.getElementById("content-container").style.textAlign = "center";

		document.getElementById("product-titlewrapper").style.float = "none";

		document.getElementById("news-container").style.width = "100%";
		document.getElementById("news-container").style.float = "none";

		var newsPanelElements = document.getElementsByClassName("news-panel");
		for(var i = 0 ;  i < newsPanelElements.length ; i++){
			newsPanelElements[i].style.padding = "15px";
			newsPanelElements[i].style.width = "100%";
		}

		var newsItemElements = document.getElementsByClassName("news-item");
		for(var i = 0 ; i < newsItemElements ; i++)
		{
			newsItemElements[i].style.width = 450;
		}
	}
};

</script>