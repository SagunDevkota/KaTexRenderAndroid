# JLaTexMath-KaTex
[![](https://jitpack.io/v/SagunDevkota/JLaTexMath-KaTex.svg)](https://jitpack.io/#SagunDevkota/JLaTexMath-KaTex)
- [x] Rendering of LaTeX Math inside of an Android View
- [x] Easy to use.


**JLaTexMath-KaTex** is a Java library. Its main purpose is to display mathematical formulas written in LaTeX.

A [KhanAcademy Katex](https://khan.github.io/KaTeX/) based Library for Rendering math faster in various Android Devices. This a View which is created from extending webview. This view allows you to render latex in your android devices. It can load normal text, text with latex and latex alone. The only thing you have to make sure is your latex should be enclosed inside either **$your latex formula$ or $$your latex formula$$**.

## Installation
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency
```
dependencies {
		implementation 'com.github.SagunDevkota:JLaTexMath-KaTex:1.0.0'
	}
```

### Samples
**Code**

>activity.xml:
```Layout
<com.sd2.katex_android.RenderLatex
android:id="@+id/latex"
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
>java:
```
RenderLatex renderLatex;
renderLatex = findViewById(R.id.latex);
renderLatex.setText("$\\lim_{x\\rightarrow0}\\frac{\\sin x^o}x$");
```

>output:

`renderLatex.setText("$\\lim_{x\\rightarrow0}\\frac{\\sin x^o}x$");`
![](https://raw.githubusercontent.com/SagunDevkota/JLaTexMath-KaTex/b412bb610af147f31b93b64387c0f8b47b54aeb2/img/com.sd2.latexhow%20(2).jpg)
`renderLatex.setText("$\\frac{\\lambda_c}{\\lambda_p}=\\frac{\\displaystyle\\frac h{\\sqrt{2m_eev}}}{\\frac h{\\sqrt{2m_pev}}}=\\sqrt{\\frac{m_p}{m_e}}$");`
![](https://raw.githubusercontent.com/SagunDevkota/JLaTexMath-KaTex/b412bb610af147f31b93b64387c0f8b47b54aeb2/img/com.sd2.latexhow.jpg)
