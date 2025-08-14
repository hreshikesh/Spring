package com.xworkz.trainer.service;

import com.xworkz.trainer.dto.*;
import com.xworkz.trainer.entity.*;

public interface TrainerService {



    boolean saveBook(BookDto bookDto);

    boolean saveCar(CarDto carDto);

    boolean saveCollege(CollegeDto collegeDto);

    boolean saveCompany(CompanyDto companyDto);

    boolean saveDriver(DriverDto driverDto);

    boolean saveEmployee(EmployeeDto employeeDto);

    boolean saveHotel(HotelDto hotelDto);

    boolean saveLaptop(LaptopDto laptopDto);

    boolean saveMobile(MobileDto mobileDto);

    boolean saveMovie(MovieDto movieDto);

    boolean saveMusic(MusicDto musicDto);

    boolean savePg(PgDto pgDto);

    boolean saveStudent(StudentDto studentDto);

    boolean saveWoodland(WoodlandDto woodlandDto);
}
