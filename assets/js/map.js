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
    });
    marker2.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker2.getPosition());
    });
    marker3.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker3.getPosition());
    });
    marker4.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker4.getPosition());
    });
    marker5.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker5.getPosition());
    });
    marker6.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker6.getPosition());
    });
    marker7.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker7.getPosition());
    });
    marker8.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker8.getPosition());
    });
    marker9.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker9.getPosition());
    });
    marker10.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker10.getPosition());
    });
    marker11.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker11.getPosition());
    });
    marker12.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker12.getPosition());
    });
    marker13.addListener("click", () => {
        map.setZoom(16);
        map.setCenter(marker13.getPosition());
    });
}