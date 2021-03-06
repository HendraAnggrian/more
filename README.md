kota
====
Kotlin DSL and extension functions for minimalist Android development.

Deprecated
----------
[anko](https://github.com/Kotlin/anko) and [android-ktx](https://github.com/android/android-ktx) do exactly the same thing,
and are still maintained.

Showcase
--------

#### Layouts
Generate Android layouts and controls with Kotlin DSL, no XML required.
```kotlin
verticalLayout {
    val name = editText { hint = "What's on your mind?" }
    button {
        text = "Post"
        setOnClickListener { toast(name.text) }
    }
}
```
![Layouts demo][demo_layouts]

#### Collections
`SparseArray` are considered more memory-efficient `Map` for Android.
`SparseArraysKt` provides familiar APIs to make `SparseArray` Kotlin-friendly.

```kotlin
// create new mutable sparse array
val array = sparseArrayOf(Pair(12, "Little"), Pair(34, "Piggy"))

// obtain non-null element with get operator
val element = array[12]

// iterate it
array.forEachIndexed { i, element ->
    // do some shit
}
```

#### Dialogs
`DialogsKt` lets you create and show alerts and dialogs, often in one line.

```kotlin
// show a confirmation alert
alert("Are you sure?", "You have to be completely sure.", NoButton, YesButton {
    // do some shit
})

// choice alert with custom buttons
choiceAlert("Pick one", items, { dialog, index ->
    // index is selected
}, NeutralButton("Reset") {
    // neutral button is clicked
})

// progress dialog
indeterminateProgressDialog("Loading", "Please wait...")
```

#### Resources
`ResourcesKt` have consistent APIs in Activity, Fragment, and support Fragment.
Easily obtain any resources with the same syntax across your app.

```kotlin
// obtain array in Activity, Fragment, or support Fragment.
val array = getStringArray(R.array.some_array)

// checks device configurations
val myScreenSize = screenSize
val mAtLeastLarge = isScreenSizeAtLeast(SCREENLAYOUT_SIZE_LARGE)
val myKeyboard = hasKeyboard

// dp and sp conversion
val margin = 16.dp
val textSize = 18.sp
```

#### Text
`TextsKt` is focused on text spanning and string utilities.

```kotlin
// create new spannable
val spannable = "I'm a little piggy".toSpannable()

// add some spans to it
spannable.span(Regex("I'm"), ForegroundColorSpan(Color.RED))
spannable.spanRange(5, 6, RelativeSizeSpan(18.sp))
spannable.spanAll(BackgroundColorSpan(Color.YELLOW))

// TextUtils.java
val isEmpty = spannable.isEmpty
```

#### Others
```kotlin
// display a toast
toast("I'm a little piggy")

// or snackbar
snackbar(R.string.are_you_sure, android.R.string.yes, { view ->
    // do some shit
})

// one-line fragment editor
fragmentManager.replace(R.id.container, myFragment)

// logging with component name as tag
debug("Little piggy just died")

// I hate Uri
val path = uri.getActualPath(context)
```

Download
--------
Each package below include core module.

```gradle
repositories {
    google()
    jcenter()
}

dependencies {
    // core module
    compile 'com.hendraanggrian:kota:0.22'
    
    // kota implementation on support fragment
    compile 'com.hendraanggrian:kota-support-v4:0.22'
    
    // individual v7 package
    compile 'com.hendraanggrian:kota-appcompat-v7:0.22'
    compile 'com.hendraanggrian:kota-cardview-v7:0.22'
    compile 'com.hendraanggrian:kota-gridlayout-v7:0.22'
    compile 'com.hendraanggrian:kota-preference-v7:0.22'
    compile 'com.hendraanggrian:kota-recyclerview-v7:0.22'
    
    // material design DSL
    compile 'com.hendraanggrian:kota-design:0.22'
}
```

License
-------
    Copyright 2017 Hendra Anggrian

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
[demo_layouts]: /art/demo_layouts.png
