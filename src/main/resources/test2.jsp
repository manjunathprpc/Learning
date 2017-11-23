<tbody id="extendedTr" >
			<tr>
				<td colspan="4">&nbsp;</td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="name"></fmt:message></td>
				<td class="formLabel" style="vertical-align: middle" rowspan="2"><p:radio
					property="kind" value="2" styleId="nameKind"
					onclick="checkRadio('nameKind')"/></td>
				<td class="formInput" nowrap="nowrap">

				<p:text
					property="nameQuery.name" onkeyup="checkRadio('nameKind');" onblur="checkValue(this,'nameKind');"
					size="9" maxlength="70" disabled="true"/>
				</td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="birth"></fmt:message></td>
				<td class="formInput" nowrap="nowrap"><p:text
					property="nameQuery.birth" onkeyup="checkRadio('nameKind');" onblur="checkValue(this,'nameKind');"
					size="9" maxlength="10" disabled="true"/></td>
			</tr>
			<tr>
				<td colspan="4">&nbsp;</td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="postalcode"></fmt:message></td>
				<td class="formLabel" rowspan="2" style="vertical-align: middle"><p:radio
					property="kind" value="3" styleId="codeKind"
					onclick="checkRadio('codeKind')" /></td>
				<td class="formInput" nowrap="nowrap"><p:text
					property="codeQuery.postalcode" onkeyup="checkRadio('codeKind');" onblur="checkValue(this,'codeKind');"
					size="5" disabled="true"/></td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="housenumber"></fmt:message></td>
				<td class="formInput" nowrap="nowrap"><p:text
					property="codeQuery.housenumber" onkeyup="checkRadio('codeKind');" onblur="checkValue(this,'codeKind');"
					size="5" disabled="true"/> <p:popup id="popup1">
					<fmt:message key="housenumber.hint" />
				</p:popup></td>
			</tr>
			<tr>
				<td colspan="4">&nbsp;</td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="orgname"></fmt:message></td>
				<td class="formLabel" style="vertical-align: middle" rowspan="2"><p:radio
					property="kind" value="4" styleId="placeKind"
					onclick="checkRadio('placeKind')" /></td>
				<td class="formInput" style="text-align: nowrap" nowrap><p:text
					property="placeQuery.name" onkeyup="checkRadio('placeKind');" onblur="checkValue(this,'placeKind');"
					size="9" maxlength="70" disabled="true"/></td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="place"></fmt:message></td>
				<td class="formInput" nowrap="nowrap"><p:text
					property="placeQuery.place" onkeyup="checkRadio('placeKind');" onblur="checkValue(this,'placeKind');"
					size="9" disabled="true"/></td>
			</tr>
			
			<tr>
				<td colspan="4">&nbsp;</td>
			</tr>
			<tr>
				<td class="formLabel boldLabel"><fmt:message key="kvkNumber"></fmt:message></td>
				
				<td class="formLabel" nowrap>
				
				<div id="kvkKindDiv" ><p:radio
					property="kind" value="5" styleId="kvkKind"
					onclick="checkRadio('kvkKind')" /></div>
				</td>
				
				<td class="formInput" nowrap="nowrap"><p:text property="kvkQuery.kvkNumber"
					size="9" maxlength="12" onkeyup="checkRadio('kvkKind');" onblur="checkValue(this,'kvkKind');"/>
				</td>
				
			</tr>
			
		</tbody>
		<tr>
			<td></td>
			<td></td>
			<td class="formInput"><p:button>
				<html:submit>
					<fmt:message key="submit" />
				</html:submit>
			</p:button></td>
		</tr>
	</table>
	