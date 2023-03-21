function getNowTime() {
    let today = new Date();
    let year = today.getFullYear();
    let day = today.getDay();
    let month = today.getMonth();
    let min = today.getMinutes();
    let second = today.getSeconds();
    let hour = today.getHours();

    let now = `${year}년 ${month < 10 ? '0' + month : month}월 ${day < 10 ? '0' + day : day}일 ${hour < 10 ? '0' + hour : hour}:${min < 10 ? '0' + min : min}:${second < 10 ? '0' + second : second}`
    
    let currentTime = document.getElementById('current-time');
    currentTime.getElementsByTagName('p')[1].textContent = now;
}

const test = setInterval(getNowTime, 1000);