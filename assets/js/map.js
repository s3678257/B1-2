function initMap() {
    const myLatlng = {lat:-37.836929,lng: 144.944550};
    const myLatlng2 = {lat:-37.841110,lng: 144.954620};
    const myLatlng3 = {lat:-37.81572973787994,lng: 144.95718776847377};
    const myLatlng4 = {lat:-37.832378,lng: 144.960434};
    const myLatlng5 = {lat:-37.84688891007843,lng: 144.99385705229133};
    const myLatlng6 = {lat:-37.869074781272985,lng:  144.99624806847586};
    const myLatlng7 = {lat:-37.81094383763655,lng:  144.96716337032817};
    const myLatlng8 = {lat:-37.7987954731883,lng:  144.99279051265475};
    const myLatlng9 = {lat:-37.788992205196976,lng:  144.9382671312134};
    const myLatlng10 = {lat:-37.77223434493687,lng:  145.01895959730825};
    const myLatlng11 = {lat:-37.76590265284514,lng:  144.92108332428967};
    const myLatlng12 = {lat:-37.80002663769063,lng:  144.89484872614574};
    const myLatlng13 = {lat:-37.83132375065242,lng:  144.86169832614706};

    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 12,
        center: myLatlng,
    });
    const contentString =
            "<p><h5>Aughtie Walk</h5></p>"+
            "<p><h6>Location:</h6>\n " +
            "Old Aughtie Dr\n" +
            "Albert Park VIC 3206</p>"+
            "<p><h6>Site type :</h6>Walk-in clinic</p>"+
            "<p><h6>Opening hours :</h6> 9.30am-4.30pm(Monday-Friday)</p>"+
            "<p><h6>Age limit : </h6>All ages</h6></p>"
    ;
    const infowindow = new google.maps.InfoWindow({
        content: contentString,
    });
    const contentString2 =
        "<p><h5>Port Melbourne Respiratory Clinic</h5></p>"+
        "<p><h6>Location:</h6>\n " +
        "shop 1/405 Bay St\n" +
        "Port Melbourne VIC 3207</p>"+
        "<p><h6>Site type : </h6>GP Respiratory Clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow2 = new google.maps.InfoWindow({
        content: contentString2,
    });

    const contentString3 =
        "<p><h5>Bourke Street Melbourne</h5></p>"+
        "<p><h6>Location:</h6>\n " +
        "231 Victoria Rd\n" +
        "Melbourne VIC 3078</p>"+
        "<p><h6>Site type : </h6>Walk-in clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow3 = new google.maps.InfoWindow({
        content: contentString3,
    });
    const contentString4 =
        "<p><h1>Montague Street</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "Montague St\n" +
        "South Melbourne VIC 3205</p>"+
        "<p><h6>Site type : </h6>Walk-in clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4.30pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow4 = new google.maps.InfoWindow({
        content: contentString4,
    });

    const contentString5 =
        "<p><h1>Prahran Respiratory Clinic</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "240 Malvern Rd\n" +
        "Prahran VIC 3181</p>"+
        "<p><h6>Site type : </h6>GP Respiratory Clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow5 = new google.maps.InfoWindow({
        content: contentString5,
    });

    const contentString6 =
        "<p><h1>Melbourne Pathology</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "287B Carlisle St\n" +
        "Balaclava VIC 3183</p>"+
        "<p><h6>Site type : </h6>Pathology Clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4.30pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow6 = new google.maps.InfoWindow({
        content: contentString6,
    });

    const contentString7 =
        "<p><h1>4Cyte Pathology</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "231 Russell St\n" +
        "Melbourne VIC 3000</p>"+
        "<p><h6>Site type : </h6>Pathology Clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow7 = new google.maps.InfoWindow({
        content: contentString7,
    });

    const contentString8 =
        "<p><h1>Cohealth</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "365 Hoddle St\n" +
        "Collingwood VIC 3066</p>"+
        "<p><h6>Site type : </h6>Walk-in clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4.30pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow8 = new google.maps.InfoWindow({
        content: contentString8,
    });

    const contentString9 =
        "<p><h1>Melbourne Pathology</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "70 Alfred St\n" +
        "North Melbourne VIC 3051</p>"+
        "<p><h6>Site type : </h6>Pathology Clinic</p>"+
        "<p><h6>Opening hours : </h6>9.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow9 = new google.maps.InfoWindow({
        content: contentString9,
    });

    const contentString10 =
        "<p><h1>4Cyte Pathology</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "202 Station St\n" +
        "Fairfield VIC 3078</p>"+
        "<p><h6>Site type : </h6>Pathology Clinic</p>"+
        "<p><h6>Opening hours : </h6>8.00am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow10 = new google.maps.InfoWindow({
        content: contentString10,
    });

    const contentString11 =
        "<p><h1>Melbourne Pathology</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "45A Hall St\n" +
        "Moonee Ponds VIC 3039</p>"+
        "<p><h6>Site type : </h6>Pathology Clinic</p>"+
        "<p><h6>Opening hours : </h6>7.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow11 = new google.maps.InfoWindow({
        content: contentString11,
    });

    const contentString12 =
        "<p><h1>Cohealth</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "78 Paisley St\n" +
        "Footscray VIC 3011</p>"+
        "<p><h6>Site type : </h6>Walk-in clinic</p>"+
        "<p><h6>Opening hours : </h6>7.30am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow12 = new google.maps.InfoWindow({
        content: contentString12,
    });
    const contentString13 =
        "<p><h1>Altona North Respiratory Clinic</h1></p>"+
        "<p><h6>Location:</h6>\n " +
        "REAR OF, 6/230 Blackshaws Rd\n" +
        "Altona North VIC 3025</p>"+
        "<p><h6>Site type : </h6>GP Respiratory Clinic</p>"+
        "<p><h6>Opening hours : </h6>8.00am-4pm(Monday-Friday)</p>"+
        "<p><h6>Age limit : </h6>All ages</p>";
    const infowindow13 = new google.maps.InfoWindow({
        content: contentString13,
    });
    const marker = new google.maps.Marker({
        position: myLatlng,
        map,
        title: "Click to zoom",
    });

    const marker2 = new google.maps.Marker({
        position: myLatlng2,
        map,
        title: "Click to zoom",
    });

    const marker3 = new google.maps.Marker({
        position: myLatlng3,
        map,
        title: "Click to zoom",
    });
    const marker4 = new google.maps.Marker({
        position: myLatlng4,
        map,
        title: "Click to zoom",
    });
    const marker5 = new google.maps.Marker({
        position: myLatlng5,
        map,
        title: "Click to zoom",
    });
    const marker6 = new google.maps.Marker({
        position: myLatlng6,
        map,
        title: "Click to zoom",
    });
    const marker7 = new google.maps.Marker({
        position: myLatlng7,
        map,
        title: "Click to zoom",
    });
    const marker8 = new google.maps.Marker({
        position: myLatlng8,
        map,
        title: "Click to zoom",
    });
    const marker9 = new google.maps.Marker({
        position: myLatlng9,
        map,
        title: "Click to zoom",
    });
    const marker10 = new google.maps.Marker({
        position: myLatlng10,
        map,
        title: "Click to zoom",
    });
    const marker11 = new google.maps.Marker({
        position: myLatlng11,
        map,
        title: "Click to zoom",
    });
    const marker12 = new google.maps.Marker({
        position: myLatlng12,
        map,
        title: "Click to zoom",
    });
    const marker13 = new google.maps.Marker({
        position: myLatlng13,
        map,
        title: "Click to zoom",
    });


    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker2.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker3.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker4.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker5.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker6.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker7.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker8.getPosition());
        }, 3000);
    });

    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker9.getPosition());
        }, 3000);
    });
    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker10.getPosition());
        }, 3000);
    });
    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker11.getPosition());
        }, 3000);
    });
    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker12.getPosition());
        }, 3000);
    });
    map.addListener("center_changed", () => {
        // 3 seconds after the center of the map has changed, pan back to the
        // marker.
        window.setTimeout(() => {
            map.panTo(marker13.getPosition());
        }, 3000);
    });
    marker.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker.getPosition());
        infowindow.open({
            anchor: marker,
            map,
            shouldFocus: false,
        });
    });

    marker2.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker2.getPosition());
        infowindow2.open({
            anchor: marker2,
            map,
            shouldFocus: false,
        });
    });
    marker3.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker3.getPosition());
        infowindow3.open({
            anchor: marker3,
            map,
            shouldFocus: false,
        });
    });
    marker4.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker4.getPosition());
        infowindow4.open({
            anchor: marker4,
            map,
            shouldFocus: false,
        });
    });
    marker5.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker5.getPosition());
        infowindow5.open({
            anchor: marker5,
            map,
            shouldFocus: false,
        });
    });
    marker6.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker6.getPosition());
        infowindow6.open({
            anchor: marker6,
            map,
            shouldFocus: false,
        });
    });
    marker7.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker7.getPosition());
        infowindow7.open({
            anchor: marker7,
            map,
            shouldFocus: false,
        });
    });
    marker8.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker8.getPosition());
        infowindow8.open({
            anchor: marker8,
            map,
            shouldFocus: false,
        });
    });
    marker9.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker9.getPosition());
        infowindow9.open({
            anchor: marker9,
            map,
            shouldFocus: false,
        });
    });
    marker10.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker10.getPosition());
        infowindow10.open({
            anchor: marker10,
            map,
            shouldFocus: false,
        });
    });
    marker11.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker11.getPosition());
        infowindow11.open({
            anchor: marker11,
            map,
            shouldFocus: false,
        });
    });
    marker12.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker12.getPosition());
        infowindow12.open({
            anchor: marker12,
            map,
            shouldFocus: false,
        });
    });
    marker13.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker13.getPosition());
        infowindow13.open({
            anchor: marker13,
            map,
            shouldFocus: false,
        });
    });
}