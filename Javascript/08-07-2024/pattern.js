function pattern(){

    var i, j,k;
    for (i = 0; i < 10; i++) {
        for (j = 0; j < i; j++){
           document.write('*');
        }
        document.write("<br>");
    }
}
pattern();
