package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mapping.AccessOptions.SetOptions.Propagation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.entity.Car;
import com.valtech.spring.boot.repo.CarRepository;


@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CarServiceImpl implements CarService {
	
	 @Autowired
	    private CarRepository carRepository;
	    
	    /* (non-Javadoc)
		 * @see com.valtech.spring.boot.service.CarService#create(com.valtech.spring.boot.entity.Car)
		 */
	    @Override
		@Transactional(propagation=Propagation.REQUIRED)
	    public Car create(Car car){
	        return carRepository.save(car);
	    }
	    
	    /* (non-Javadoc)
		 * @see com.valtech.spring.boot.service.CarService#save(com.valtech.spring.boot.entity.Car)
		 */
//	    @Override
//		@Transactional(propagation=Propagation.REQUIRED)
//	    public Car save(Car car){
//	        return carRepository.save(car);
//	    }
	    
	    /* (non-Javadoc)
		 * @see com.valtech.spring.boot.service.CarService#update(com.valtech.spring.boot.entity.Car)
		 */
	    @Override
		@Transactional(propagation=Propagation.REQUIRED)
	    public Car update(Car car){
	        return carRepository.save(car);
	    }
	    
	    /* (non-Javadoc)
		 * @see com.valtech.spring.boot.service.CarService#get(int)
		 */
	    @Override
		public Car get(int id){
	        return carRepository.getReferenceById(id);
	    }
	    /* (non-Javadoc)
		 * @see com.valtech.spring.boot.service.CarService#getAllCars()
		 */
	    @Override
		public List<Car> getAllCars(){
	        return carRepository.findAll();
	    }

		@Override
		public Car getCar(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	


}
