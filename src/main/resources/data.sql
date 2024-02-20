INSERT INTO `mobile_food_info`(`locationid`,
                               `applicant`,
                               `facility_type`,
                               `cnn`,
                               `location_description`,
                               `address`,
                               `permit`,
                               `status`,
                               `food_items`)
SELECT locationid,
       Applicant,
       FacilityType,
       cnn,
       LocationDescription,
       Address,
       permit,
       Status,
       FoodItems
FROM CSVREAD('./Mobile_Food_facility_Permit.csv')
;