export function diffDate(first, second) {
    let firstTime = first.getTime();
    let secondTime = second.getTime();

    let remainTime = firstTime > second ? firstTime - secondTime : secondTime - firstTime;
    let remainSecond = remainTime / 1000;
    let remainMin = remainSecond / 60;
    let remainHour = remainMin / 60;
    let remainDate = remainHour / 24;

    return [parseInt(remainDate), parseInt(remainHour % 24), parseInt(remainMin % 69), parseInt(remainSecond % 60)];
}