/*
 * Copyright 2016 svilupposw.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import it.engim.templatedb.PM;
import javax.persistence.EntityManager;
import org.apache.wicket.model.LoadableDetachableModel;

public class VoceModel extends LoadableDetachableModel<Voce>{

    private int id;
    
    public VoceModel(int id)
    {
        this.id= id;
    }
    @Override
    protected Voce load() 
    {
        //carica un cliente dal database
        
        //APRE UNA CONNESSIONE DAL DATABASE
        EntityManager em = PM.getEM();
        try
        {
            Voce c = em.find(Voce.class, id);
             return c;
        }
        finally
        {
            em.close();
        }
    }
    
}