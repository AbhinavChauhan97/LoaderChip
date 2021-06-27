# LoaderChip

A simple library to show a loader around the edges of a materail chip 

<b> Usage </b>

<i> Simply put in your layout file </i>
 
                  
          <com.abhinav.chouhan.loaderchip.LoaderChip
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Click Me"
                android:textAlignment="center"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                app:layout_constraintTop_toTopOf="parent" />
        
        
  by deault a red loading line will show up , you can customize with following attributes 
  
  attribute | format | desciption 
--- | --- |  --- 
loaderColor | color | give a desired color to loader line 
loaderWidth | dp | give desired with to loading line 
lapDuration | integer | give desired duration in millis for a complete rotation of loader line around the chip
loadOnClick | boolean | indicates whether or not you want to start the laoder on the click of the chip , defaut value is true
loaderColorStart/loaderColorEnd | color | these attributes falls in one column because there effect is only visible if both of them are present they are used to draw loading line in a gradient color , where loaderColorStart gives the start color and loaderColorEnd gives the end color of the gradient , when these attributes are present loaderColor attributes is ignored if present , if only one of them is present loaderColor is used.



<b>Default Loader</b>

![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker.gif)



Gradient Loader (Use both loaderColorStart and loaderColorEnd attributes for gradient loader of those two colors)


![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(1).gif)


Loader with width = 4dp and lapduration = 4000 milliseconds 

![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(2).gif)

  
  
        
        
            
