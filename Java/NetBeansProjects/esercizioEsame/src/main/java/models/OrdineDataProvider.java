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
import models.Ordine;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;

import org.apache.wicket.model.IModel;

public class OrdineDataProvider extends SortableDataProvider<Ordine, String>
{

  @Override
  public Iterator<? extends Ordine> iterator(long first, long count)
  {
    EntityManager em = PM.getEM();
    try
    {
      Query q = em.createNamedQuery("Ordine.findAll");
      q.setFirstResult((int) first);
      q.setMaxResults((int) count);
      List<Ordine> res = q.getResultList();
      return res.iterator();
    }
    finally
    {
      em.close();
    }
  }

  @Override
  public long size()
  {
    EntityManager em = PM.getEM();
    try
    {
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<Long> cq = cb.createQuery(Long.class);
      Root<Ordine> root = cq.from(Ordine.class);
      cq.select(cb.count(root));
      return em.createQuery(cq).getSingleResult();
    }
    finally
    {
      em.close();
    }
  }

  @Override
  public IModel<Ordine> model(Ordine object)
  {
    return new OrdineModel(object.getId());
  }


}