import {diffDate} from './diffDate.js';

let outDate = document.getElementById('out-date');
outDate = outDate.getElementsByTagName('p')[1];

function getRemainTime() {
    let date = new Date(outDate.textContent);
    let today = new Date();

    let remainTime = diffDate(date, today);

    let time = `${remainTime[0]}일 ${remainTime[1] < 10 ? '0' + remainTime[1] : remainTime[1]}시간 ${remainTime[2] < 10 ? '0' + remainTime[2] : remainTime[2]}분 ${remainTime[3] < 10 ? '0' + remainTime[3] : remainTime[3]}초`;
    
    let remainDate = document.getElementById('remain-day');
    remainDate.getElementsByTagName('p')[1].textContent = time;
}

setInterval(getRemainTime, 1000);