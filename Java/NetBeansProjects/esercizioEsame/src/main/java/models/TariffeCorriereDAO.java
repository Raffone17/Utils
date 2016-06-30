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

/**
 *
 * @author svilupposw
 */


import it.engim.templatedb.PM;
//import it.virtualbit.beans.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TariffeCorriereDAO
{
  public static void salva(TariffeCorriere c)
  {
    EntityManager em
            = PM.getEM();
    EntityTransaction et
            = em.getTransaction();
    try
    {
      et.begin();
      em.merge(c);
      et.commit();
    }
    finally
    {
      if (et.isActive())
      {
        et.rollback();
      }
      em.close();
    }
  }

  public static List elenco() { 
      EntityManager em = PM.getEM(); 
      try { Query q = em.createNamedQuery("TariffeCorriere.findAll");
      List res = q.getResultList();
      return res;
      } finally {
          em.close();
          
      } 
  } public static void elimina(TariffeCorriere c) { 
      EntityManager em = PM.getEM();
      EntityTransaction et = em.getTransaction();
      try {
          et.begin();
          c = em.find(TariffeCorriere.class, c.getId());
          em.remove(c);
          et.commit();
      } finally { 
          if (et.isActive()) et.rollback();
          em.close();
      }
  } 
} 