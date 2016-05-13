var myCenter=new google.maps.LatLng(53.4716257,-2.2836891);
		
		function initialize()
		{
		var mapProp = {
		  center:myCenter,
		  zoom:16,
		  mapTypeId:google.maps.MapTypeId.ROADMAP
		  };
		
		var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
		
		var marker=new google.maps.Marker({
		  position:myCenter,
		  });
		
		marker.setMap(map);
		
		var infowindow = new google.maps.InfoWindow({
		  content:'<h3>NB Gardens</h3>' +
		  '<p>5th Floor, Anchorage 1</p>' +
		  '<p>Anchorage Quay, Salford Quays</p>' +
		  '<p>Greater Manchester, M50 3YJ</p>'
		  });
		
		infowindow.open(map,marker);
		}
		
		google.maps.event.addDomListener(window, 'load', initialize);