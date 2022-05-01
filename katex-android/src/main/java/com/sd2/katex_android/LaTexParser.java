package com.sd2.katex_android;

import android.util.Log;

public class LaTexParser {
    public static String getHtml(String latex){
        Log.d("TAG", "getHtml: "+latex);
        String Html_template = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, Helvetica, sans-serif;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <!-- KaTeX -->\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/katex@0.15.3/dist/katex.min.css\" integrity=\"sha384-KiWOvVjnN8qwAZbuQyWDIbfCLFhLXNETzBQjA/92pIowpC0d2O3nppDGQVgwd2nB\" crossorigin=\"anonymous\">\n" +
                "\t<script defer src=\"https://cdn.jsdelivr.net/npm/katex@0.15.3/dist/katex.min.js\" integrity=\"sha384-0fdwu/T/EQMsQlrHCCHoH10pkPLlKA1jL5dFyUOvB3lfeT2540/2g6YgSi2BL14p\" crossorigin=\"anonymous\"></script>\n" +
                "\t<script defer src=\"https://cdn.jsdelivr.net/npm/katex@0.15.3/dist/contrib/auto-render.min.js\" integrity=\"sha384-+XBljXPPiv+OzfbB3cVmLHf4hdUFHlWNZN5spNQ7rmHTXpd7WvJum6fIACpNNfIR\" crossorigin=\"anonymous\"></script>\n" +
                "\t<script>\n" +
                "\t    document.addEventListener(\"DOMContentLoaded\", function() {\n" +
                "\t        renderMathInElement(document.body, {\n" +
                "\t          // customised options\n" +
                "\t          // • auto-render specific keys, e.g.:\n" +
                "\t          delimiters: [\n" +
                "\t              {left: '$$', right: '$$', display: true},\n" +
                "\t              {left: '$', right: '$', display: false},\n" +
                "\t              {left: '\\\\(', right: '\\\\)', display: false},\n" +
                "\t              {left: '\\\\[', right: '\\\\]', display: true}\n" +
                "\t          ],\n" +
                "\t          // • rendering keys, e.g.:\n" +
                "\t          throwOnError : false\n" +
                "\t        });\n" +
                "\t    });\n" +
                "\t</script>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\t<p>"+latex +
                " </p>\n" +
                "</body>\n" +
                "</html>";
        return Html_template;
    }
}
