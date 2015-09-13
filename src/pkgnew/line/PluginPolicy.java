/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.security.AllPermission;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;

/**
 *
 * @author amine
 */
public class PluginPolicy extends Policy {

    @Override
    public PermissionCollection getPermissions(CodeSource codeSource) {
        Permissions p = new Permissions();
        if(true){//in the future we'll have somesort of conditions..
            p.add(new AllPermission());
        }
        return p;
    }
    
    @Override
    public void refresh(){
        
    }
}
