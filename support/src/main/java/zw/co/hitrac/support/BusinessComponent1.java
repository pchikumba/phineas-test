package zw.co.hitrac.support;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hitrac
 * @param <T>
 */
public interface BusinessComponent1<T> extends Serializable {

    public T save(T t);

    public List<T> findAll();

    public T find(Long id);
    
  

}
