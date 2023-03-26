let rmBtn = document.getElementById('rm-btn');

    rmBtn.addEventListener('click', () => {
    let outDate = new Date(document.getElementById('out-date').textContent);
    let now = new Date();

    if(now > outDate) {
        window.location.href = '/removeUser'
    } else {
        alert('삭제하려는거야? 뺑이나쳐라ㅋㅋ');
    }
});