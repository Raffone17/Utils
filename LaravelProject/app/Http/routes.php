<?php

/*
|--------------------------------------------------------------------------
| Routes File
|--------------------------------------------------------------------------
|
| Here is where you will register all of the routes in an application.
| It's a breeze. Simply tell Laravel the URIs it should respond to
| and give it the controller to call when that URI is requested.
|
*/

Route::get('/', function () {
    return view('welcome');
});
Route::get('/prova',function(){
    return view('prova');
});

Route::get('/ciao',function () {
    return "<h1>Ciao Ciao mondo di babbioni!!!!</h1>";
});

Route::get('/user/{user_id}',function ($userId){
    return "User idiota " . $userId;
});
Route::get('/saluta/{nome}','ControllerSaluta@saluta');

Route::get('/hello','MioController@ciao_mondo');
Route::get('/login/{nome}','MioController@login');
Route::get('/hello/{nome}','MioController@ciao_mondo_con_parametro');
Route::get('/csv','MioController@csv');

Route::get('/ciao/{nome}',function ($n) {
    return "<h1>Ciao ".$n.", sei un pirla!</h1>";
});

Route::get('/primi',function () {
    for($i=1; $i<100000; $i++){
        if(( $i%2 != 0 )&&( $i%3 != 0 )&&( $i%5 != 0 )&&( $i%7 != 0 )){
            echo "| ".$i;
        }
    }
});
/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| This route group applies the "web" middleware group to every route
| it contains. The "web" middleware group is defined in your HTTP
| kernel and includes session state, CSRF protection, and more.
|
*/

Route::group(['middleware' => ['web']], function () {
    //
});
