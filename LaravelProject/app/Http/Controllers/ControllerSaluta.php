<?php


namespace App\Http\Controllers;




class ControllerSaluta extends Controller
{
    public function saluta($nome){
        return "<h3>Ciao ".$nome."</h3>";
    }
    
  
}