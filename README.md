# android-viewbinding
this is android viewbinding

Welcome Star and Issues

download jar : [android-viewbinding-src.jar](https://raw.githubusercontent.com/LiangMaYong/android-viewbinding/master/jar/android-viewbinding-src.jar)

## Use this
```
@BindLayout(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewBinding.parserActivity(this);
    }
}
```

##License
```
Copyright 2016 LiangMaYong

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
