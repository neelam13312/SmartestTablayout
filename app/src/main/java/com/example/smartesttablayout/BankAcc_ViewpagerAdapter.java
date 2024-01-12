package com.example.smartesttablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



import java.util.ArrayList;

;

public class BankAcc_ViewpagerAdapter extends FragmentPagerAdapter {
  int TOTALPAge =4;
  String pagetitle;
  ArrayList<BankAcc_List_Model> bankAcc_list_models;
  ArrayList<UPi_idList_Model> uPiIdListModels;
  public BankAcc_ViewpagerAdapter(FragmentManager fragmentManager, ArrayList<BankAcc_List_Model> bankAcc_list_models, ArrayList<UPi_idList_Model> uPiIdListModels){
    super(fragmentManager);


    this.bankAcc_list_models=bankAcc_list_models;
    this.uPiIdListModels=uPiIdListModels;
  }




  @NonNull
  @Override
  public Fragment getItem(int position) {
    Fragment selectedFragment = null;
    switch (position) {
      case 0:
        selectedFragment = new HomeFragment();

        break;
      case 1:

        selectedFragment = new HomeFragment();
        break;
            case 2:
                // pagetitle = " Upcoming Exam";
                selectedFragment = new HomeFragment();
                break;
                case 3:
                // pagetitle = " Upcoming Exam";
                selectedFragment = new HomeFragment();
                break;


    }
    return selectedFragment;
  }

  @Override
  public int getCount() {
    return TOTALPAge;

  }
  @Override
  public CharSequence getPageTitle(int position) {
    switch (position) {
      case 0:
        pagetitle = "Bank Account";

        break;
      case 1:
        pagetitle = "UPI ID";
        break;
        case 2:
        pagetitle = "Nakka ID";
        break;case 3:
        pagetitle = "jkchjk ID";
        break;
    }
    return pagetitle;
  }
}