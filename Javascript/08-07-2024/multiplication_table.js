function mult_table() {
    document.write("<table id='multiplicationTable' style='border: solid black; border-collapse: collapse;'>");
    for (var i = 1; i <= 10; i++) {
        document.write("<tr style='border: solid black;'>");
        for (var j = 1; j <= 10; j++) {
            document.write("<td style='border: solid black; padding: 5px; text-align: center;'>" + i * j + "</td>");
        }
        document.write("</tr>");
    }
    document.write("</table>");
}

mult_table();
