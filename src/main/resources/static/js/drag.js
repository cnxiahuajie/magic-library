function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    let ele = ev.target;
    let id = ele.getAttribute('data-id');
    ev.dataTransfer.setData("id", id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("id");
    $("#ArticleViewBox").load("/article/detail");
}