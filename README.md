# LoaderChip

A simple library to show a loader around the edges of a materail chip 

<b> Usage </b>

<i>put in root build.gradle</i>


                       allprojects {
	                        	repositories {
		                           	...
		                       	maven { url 'https://jitpack.io' }
               		       }
                	       }

<i> in module build.gradle </i>

               implementation 'com.github.AbhinavChauhan97:LoaderChip:1.0.4'
<i> Simply put in your layout file </i>
 
                  
          <com.abhinav.chouhan.loaderchip.LoaderChip
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Click Me"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                app:layout_constraintTop_toTopOf="parent" />
        
        
  by deault a red loading line will show up , you can customize with following attributes 
  
  attribute | format | desciption 
--- | --- |  --- 
loaderColor | color | give a desired color to loader line 
loaderWidth | dimension | give desired with to loading line 
lapDuration | integer | give desired duration in millis for a complete rotation of loader line around the chip
loadOnClick | boolean | indicates whether or not you want to start the laoder on the click of the chip , defaut value is true
loaderColorStart/loaderColorEnd | color | these attributes falls in one column because there effect is only visible if both of them are present they are used to draw loading line in a gradient color , where loaderColorStart gives the start color and loaderColorEnd gives the end color of the gradient , when these attributes are present loaderColor attributes is ignored if present , if only one of them is present loaderColor is used.
reverseEffect | boolean | indicates whether or not loader should go back and forth 
loadingText | String | optional text to  show while loading
loadingTextColor | String | text color to show while loading
loaderStyle | enum | use to provide a loading style possible values `bounce` , `accelerate` , `decelerate` , `accelerateThenDecelerate`(default) , `linear` , `overshoot` , `fastOutSlowIn`



<b>Default Loader</b>

![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker.gif)



Gradient Loader (Use both loaderColorStart and loaderColorEnd attributes for gradient loader of those two colors)


![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(1).gif)


Loader with width = 4dp and lapduration = 4000 milliseconds 

![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(2).gif)


Loader with `overshoot` `loaderStyle` 

![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(3).gif)
  
  
 Loader with `bounce` `loaderStyle`
 
 ![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(4).gif)
 
 
 Loaders with `reverseEffect` enabled and with vairous corner radius 
 
 ![](https://github.com/AbhinavChauhan97/LoaderChip/blob/master/ezgif.com-gif-maker%20(5).gif)
 
 xml file of above Screen
 
        <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:app="http://schemas.android.com/apk/res-auto"
              xmlns:tools="http://schemas.android.com/tools"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              tools:context=".MainActivity">

        <com.abhinav.chouhan.loaderchip.LoaderChip
             android:id="@+id/loaderChip3"
             android:layout_width="200dp"
             android:layout_height="60dp"
             android:text="Clicked Me !"
             app:lapDuration="2000"
             app:loaderWidth="5dp"
             app:loaderStyle="bounce"
             app:chipCornerRadius="5dp"
             app:reverseEffect="true"
             app:layout_constraintVertical_bias="0.7"
             app:layout_constraintBottom_toBottomOf="parent"
             app:layout_constraintLeft_toLeftOf="parent"
             app:layout_constraintRight_toRightOf="parent"
             app:layout_constraintTop_toTopOf="parent" />

       <com.abhinav.chouhan.loaderchip.LoaderChip
              android:id="@+id/loaderChip2"
              android:layout_width="200dp"
              android:layout_height="60dp"
              android:text="Clicked Me !"
              app:lapDuration="3000"
              app:loaderWidth="8dp"
              app:loaderStyle="overshoot"
              app:reverseEffect="true"
              app:loaderColor="@android:color/holo_blue_bright"
              app:loaderColorStart="@android:color/holo_blue_bright"
              app:loaderColorEnd="@android:color/holo_red_light"
              app:layout_constraintVertical_bias="0.1"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintLeft_toLeftOf="parent"
              app:layout_constraintRight_toRightOf="parent"
              app:layout_constraintTop_toTopOf="parent" />

         <com.abhinav.chouhan.loaderchip.LoaderChip
             android:id="@+id/loaderChip"
             android:layout_width="200dp"
             android:layout_height="60dp"
             android:text="Clicked Me !"
             app:lapDuration="2000"
             app:loaderWidth="3dp"
             app:reverseEffect="true"
             app:chipCornerRadius="15dp"
             app:layout_constraintVertical_bias="0.4"
             app:loaderColor="@android:color/holo_blue_bright"
             app:layout_constraintBottom_toBottomOf="parent"
             app:layout_constraintLeft_toLeftOf="parent"
             app:layout_constraintRight_toRightOf="parent"
             app:layout_constraintTop_toTopOf="parent" />

    </androidx.constraintlayout.widget.ConstraintLayout>
        
            
